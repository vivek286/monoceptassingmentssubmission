class Cell{
    constructor(mark){
        this.mark=mark
    }
    static newCell(mark){
        return new Cell(mark)
    }
    isMarked(){
        return this.mark!=="z"
    }

    markCell(mark){
        this.mark=mark;
    }

}
module.exports=Cell