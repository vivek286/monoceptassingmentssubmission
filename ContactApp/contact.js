class Contact {
    constructor(cName) {
        this.cName = cName
        this.contactInfos = []
    }
    isString=(cName)=>{
        if(typeof cName=="string") return true;
        return false;
    }
    static newContact(cName) {
        if(!cName.isString){
            throw new Error("Invalid Name passed")
        }
        return new Contact(cName)
    }
}
module.exports = Contact