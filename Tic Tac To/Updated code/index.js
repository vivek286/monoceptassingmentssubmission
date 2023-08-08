const Board = require("./board");
const Game = require("./game");
Board

try {
    const g1=Game.newGame("Aakash","x","Anil","o")
    console.log(g1.play(0));
    console.log(g1.play(4));
    console.log(g1.play(1));
    console.log(g1.play(3));
    console.log(g1.play(2));
    const g2=Game.newGame("Anil","x","Ravi","o")
    console.log(g2.play(0));
    console.log(g2.play(4));
    console.log(g2.play(1));
    console.log(g2.play(3));
    console.log(g2.play(2));
    // console.log(g1.play(6));

    // g1.board.showBoard();


} catch (error) {
    console.log(error.message);
}
