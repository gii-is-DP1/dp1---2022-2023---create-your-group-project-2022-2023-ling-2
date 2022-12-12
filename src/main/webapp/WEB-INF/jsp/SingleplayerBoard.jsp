<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="endofline" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<endofline:layout pageName="singleplayer_game">
    <div class="center">
        <h1>Singleplayer</h1>
        <endofline:board side="5" gameCards="${gameCards}" puzzleCards="${puzzleCards}"/>
        <div id="hand" class="center">
            <endofline:hand handCards="${handCards}" num="5" cards_left="${cards_left}" energyLeft="${game.energy}"/>
        </div>
        <c:if test="${result!=null}">
            <script>
                document.getElementById("hand").setAttribute("style", "display: none !important;");
            </script>
            <c:choose>
                <c:when test="${result=='win'}">
                    <div class="center text-success">
                        <h1>You won!</h1>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="center text-danger">
                        <h1>You lost</h1>
                    </div>
                </c:otherwise>
            </c:choose>
            <a href="/" class="btn btn-primary">Continue</a>
        </c:if>
    </div>
</endofline:layout>
<script>
    let lastPlacedCard = {
        "x": "2",
        "y": "2",
        "rotation": "0",
        "status": "0",
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
            "status": "${game.lastPlacedCard.status}",
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
                "status": "${card.status}",
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
            "status": "${card.status}",
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
    ];

    let energyLeft = ${game.energy};
</script>
