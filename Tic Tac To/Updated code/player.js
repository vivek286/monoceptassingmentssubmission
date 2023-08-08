class Player{
    constructor(name, symbol){
        this.name=name
        this.symbol=symbol
    }

    static newPlayer(name, symbol){
        if(typeof name != 'string' || (symbol!="x" && symbol!="o")){
                throw new Error("erro")
        }
        
        return new Player(name, symbol)
    }

    markCell(cell){
        cell.markCell(this.symbol)
    }
}

module.exports=Player