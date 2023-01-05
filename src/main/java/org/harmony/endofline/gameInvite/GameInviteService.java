package org.harmony.endofline.gameInvite;

import org.harmony.endofline.multiplayer.Multiplayer;
import org.harmony.endofline.multiplayer.MultiplayerService;
import org.harmony.endofline.user.User;
import org.harmony.endofline.userGame.UserGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GameInviteService {

    private final GameInviteRepository gameInviteRepository;

    private final MultiplayerService multiplayerService;

    @Autowired
    public GameInviteService(GameInviteRepository gameInviteRepository, MultiplayerService multiplayerService){
        this.gameInviteRepository = gameInviteRepository;
        this.multiplayerService = multiplayerService;
    }

    @Transactional
    public void setAllPendingCanceled(Integer gameID){
        List<GameInvite> pendingInvites = this.gameInviteRepository.findAllInvitesOfGame(gameID);
        for (GameInvite invite: pendingInvites) {
            this.gameInviteRepository.update(invite.accepted,invite.pending, true, invite.getId());
        }
    }

    @Transactional
    public void acceptInvite(Integer id){
        GameInvite invite = this.gameInviteRepository.findById(id).get();
        this.gameInviteRepository.update(true,false,false,invite.getId());
        if(invite.type == InviteType.PLAYER) {
            this.setAllPendingCanceled(invite.game.getId());
        }
        this.multiplayerService.addPlayer2(false,invite.getReceiver(),invite.game);

    }

    @Transactional
    public void declineInvite(Integer id){
        GameInvite invite = this.gameInviteRepository.findById(id).get();
        this.gameInviteRepository.update(false,false,false,invite.getId());
    }

    @Transactional
    public void cancelInvite(Integer id){
        GameInvite invite = this.gameInviteRepository.findById(id).get();
        this.gameInviteRepository.update(false,false,true,invite.getId());
    }


    @Transactional
    public void sendInvite(Multiplayer game, User sender, User receiver, InviteType type){
        GameInvite newInvite = new GameInvite(game,sender,receiver,type);
        this.gameInviteRepository.save(newInvite);
        this.multiplayerService.addPlayer1(false,sender);

    }

    public void findById(Integer id){
        this.gameInviteRepository.findById(id);
    }

    public List<GameInvite> getByReciever(User user){
        return this.gameInviteRepository.findByReciever(user.getId());
    }

    public List<GameInvite> getBySender(User user){
        return this.gameInviteRepository.findBySender(user.getId());
    }

    public Multiplayer getGameById(Integer id){
        return this.gameInviteRepository.findGameById(id);
    }
}
