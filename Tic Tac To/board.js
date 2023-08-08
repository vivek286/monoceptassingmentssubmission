const Cell = require("./cell")

class Board{
    constructor(cells){
        this.cells=cells
    }
    static newBoard(){
        let cells=[]
        for (let index = 0; index < 9; index++) {
             cells.push(Cell.newCell("z"))
        }
        return new Board(cells)
    }
    static showBoard(){
        console.log("-------------------");
        console.log(`${this.cells[0].mark} | ${this.cells[1].mark} | ${this.cells[2].mark}`);
        console.log("-------------------");
        console.log(`${this.cells[0].mark} | ${this.cells[1].mark} | ${this.cells[2].mark}`);
        console.log("-------------------");
        console.log(`${this.cells[0].mark} | ${this.cells[1].mark} | ${this.cells[2].mark}`);
        console.log("-------------------");
    }
    
    analyzeResult(){
        //check row
        if(this.cells[0].mark!='z' && this.cells[0].mark===this.cells[1].mark
        && this.cells[1].mark===this.cells[2].mark)
        return ["win",this.cells[0].mark];

        if(this.cells[3].mark!='z' && this.cells[3].mark===this.cells[4].mark
        && this.cells[4].mark===this.cells[5].mark)
        return ["win",this.cells[3].mark];

        if(this.cells[6].mark!='z' && this.cells[6].mark===this.cells[7].mark
        && this.cells[6].mark===this.cells[8].mark)
        return ["win",this.cells[0].mark];

        //check column
        if(this.cells[0].mark!='z' && this.cells[0].mark===this.cells[3].mark
        && this.cells[3].mark===this.cells[6].mark)
        return ["win",this.cells[0].mark];

        if(this.cells[1].mark!='z' && this.cells[1].mark===this.cells[4].mark
        && this.cells[4].mark===this.cells[7].mark)
        return ["win",this.cells[1].mark];

        if(this.cells[2].mark!='z' && this.cells[2].mark===this.cells[5].mark
        && this.cells[5].mark===this.cells[8].mark)
        return ["win",this.cells[0].mark];

        //check diagonal
        if(this.cells[0].mark!='z' && this.cells[0].mark===this.cells[4].mark
        && this.cells[4].mark===this.cells[8].mark)
        return ["win",this.cells[0].mark];

        if(this.cells[2].mark!='z' && this.cells[2].mark===this.cells[5].mark
        && this.cells[5].mark===this.cells[8].mark)
        return ["win",this.cells[0].mark];

        //all cell filled check

        for (let index = 0; index < 9; index++) {
            if(this.cells[index].mark==='z')
                return ['gameRunning', "-1"]; 
        }

        return ["draw", "-1"];

    }



}
module.exports=Board