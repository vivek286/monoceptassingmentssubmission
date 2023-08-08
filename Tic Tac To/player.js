class Player{
    constructor(name, symbol){
        this.name=name
        this.symbol=symbol
    }

    static newPlayer(name, symbol){
        if(name!='strng' || symbol!='x' || symbol!='o'){
                return `Invalid Input`
        }
        
        return new Player(name, symbol)
    }

    markCell(cell){
        cell.markCell(this.symbol)
    }
}

module.exports=Player