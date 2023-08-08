const Board = require("./board");
const Game = require("./game");
Board

try {
    const g1=Game.newGame("Aakash","x","Anil","o")
    console.log(g1.play(2));
    console.log(g1.play(5));
    g1.Board.showBoard();


} catch (error) {
    console.log(error.message,"not workign");
}
