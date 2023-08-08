const Board = require("./board")
const Player = require("./player")
Board


class Game{
    constructor(players,board){
            this.players=players
            this.board=board
            this.turn=0
            this.isGameActive=true;
    }   

    static newGame(playerName1,symbol1,playerName2,symbol2){
        if(typeof playerName1 != 'string' || typeof playerName2 != 'string' )
                throw new Error("Enter player name in string formate")
        if(typeof symbol1!= 'string' || typeof symbol2 != 'string')
                throw new Error("player symobol should be string")

        let players=[Player.newPlayer(playerName1,symbol1),Player.newPlayer(playerName2,symbol2)];
        let board=Board.newBoard(); 
        return new Game(players,board)       
    }

    play(cellNo){
            // check game active or not
            if(cellNo>=9){
                return 'Invalid Cell Number'
            }
            if(!this.isGameActive){ 
                return `Game is Ended`
            }

            //check cellno is not marked already
            let isCellMarked=this.board.cells[cellNo].isMarked()
            if(isCellMarked){
                return "cell is marked already"
            }

            //markedcell
            let currentPlayer=this.players[this.turn % 2]
            // this.board.cells[cellNo].markCell(currentPlayer.symbol);
            currentPlayer.markCell(this.board.cells[cellNo])
            this.turn+=1

            //resultAnalyse
            let[state, symbol] = this.board.analyzeResult()
            if(state == "win"){
                this.isGameActive = false
                if(symbol == this.players[0].symbol){
                return `${this.players[0].name} has won the Game`
                }
                if(symbol == this.players[1].symbol){
                    return `${this.players[1].name} has won the Game`
                    }
            }
            if(state == 'draw'){
                this.isGameActive = false
                return `Draw Game`
            }
            this.board.showBoard()
            return `Continue Game`
    }


}
module.exports=Game