-- All card models
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (0,1,2,2,2); -- Start card
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (0,1,0,1,1); -- Card 0
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (1,1,0,2,2); -- Card 1
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (2,2,0,1,2); -- Card 2 left
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (2,2,0,2,1); -- Card 2 right
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (3,1,0,1,2); -- Card 3 left
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (3,1,0,2,1); -- Card 3 right
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (4,2,0,1,1); -- Card 4
INSERT INTO cards(initiative,top_side,bottom_side,left_side,right_side) VALUES (5,1,0,1,1); -- Card 5

INSERT INTO statistics(number_games, number_single_player_wins, number_single_player_losses, number_multi_player_wins, number_multi_player_losses) VALUES (34, 10, 4, 7, 13);
INSERT INTO statistics(number_games, number_single_player_wins, number_single_player_losses, number_multi_player_wins, number_multi_player_losses) VALUES (42, 20, 9, 11, 2);

INSERT INTO users(statistics_id, username,password,email,is_admin,enabled) VALUES (1, 'admin','admin','admin@localhost.com',true,true);
INSERT INTO users(statistics_id, username,password,email,is_admin,enabled) VALUES (2, 'user','user','user@localhost.com',false,true);

INSERT INTO multiplayer_games(date_ended, date_started, p1energy_left, p2energy_left) VALUES (null, '2022-11-09 11:08:21.139157', 3, 3);
INSERT INTO usergames(user_id, game_id, player, role) VALUES (1, 1, 1, 0);
INSERT INTO usergames(user_id, game_id, player, role) VALUES (2, 1, 2, 0);
INSERT INTO singleplayer_game(date_ended, date_started, user_id) VALUES (null, '2022-11-09 11:08:21.139157', 1);

INSERT INTO achievements(name,description,condition,condition_amount) VALUES ('Winner','Win one Game', 1, 1);
INSERT INTO achievements(name,description,condition,condition_amount) VALUES ('TEST admin 2','Win one Game', 3, 50);
INSERT INTO achievements(name,description,condition,condition_amount) VALUES ('TEST user 3','Win one Game', 1, 10);
INSERT INTO achievements(name,description,condition,condition_amount) VALUES ('Gamer','Create one multiplayer game', 4, 1);

INSERT INTO achievement_user(user_id,achievement_id) VALUES (1,1);
INSERT INTO achievement_user(user_id,achievement_id) VALUES (1,2);
INSERT INTO achievement_user(user_id,achievement_id) VALUES (1,3);


