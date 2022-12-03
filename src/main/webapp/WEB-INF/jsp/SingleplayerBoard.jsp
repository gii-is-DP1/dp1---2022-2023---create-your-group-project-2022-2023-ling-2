<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="endofline" tagdir="/WEB-INF/tags" %>


<endofline:layout pageName="singleplayer_game">
    <div class="center">
        <h1>Singleplayer</h1>
        <endofline:board side="5" gameCards="${gameCards}" puzzleCards="${puzzleCards}"/>
        <endofline:hand handCards="${handCards}" num="4"/>
    </div>
</endofline:layout>
<script>
    let lastPlacedCard = {
        "x": "2",
        "y": "2",
        "rotation": "0",
        "inHand": "false",
        "up" : "EXIT",
        "down" : "EMPTY",
        "left" : "EMPTY",
        "right" : "EMPTY"
    };
    if("${game.lastPlacedCard}"!==""){
        lastPlacedCard = {
            "x": "${game.lastPlacedCard.x}",
            "y": "${game.lastPlacedCard.y}",
            "rotation": "${game.lastPlacedCard.rotation}",
            "inHand": "${game.lastPlacedCard.inHand}",
            "up" : "${game.lastPlacedCard.card.up}",
            "down" : "${game.lastPlacedCard.card.down}",
            "left" : "${game.lastPlacedCard.card.left}",
            "right" : "${game.lastPlacedCard.card.right}"
        };
    }

    let cardsOnBoard = [
        <c:forEach items="${gameCards}" var="card">
            {
                "x": "${card.x}",
                "y": "${card.y}",
                "rotation": "${card.rotation}",
                "inHand": "${card.inHand}",
                "up" : "${card.card.up}",
                "down" : "${card.card.down}",
                "left" : "${card.card.left}",
                "right" : "${card.card.right}"
            },
        </c:forEach>
    ];

    let cardsInHand = [
        <c:forEach items="${handCards}" var="card">
        {
            "id": "${card.id}",
            "x": "${card.x}",
            "y": "${card.y}",
            "rotation": "${card.rotation}",
            "inHand": "${card.inHand}",
            "up" : "${card.card.up}",
            "down" : "${card.card.down}",
            "left" : "${card.card.left}",
            "right" : "${card.card.right}"
        },
        </c:forEach>
    ];

    let puzzleCards = [
        <c:forEach items="${puzzleCards}" var="card">
            {
                "x": "${card.x}",
                "y": "${card.y}"
            },
        </c:forEach>
    ]
</script>
