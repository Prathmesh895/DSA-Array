
function Pattern(n:number):void{
    for(let row=1;row<=n;row++){
        let Thisrow ="";
        for(let col=1;col<=n;col++){
            if(row==col) Thisrow +="*";
            else Thisrow += "0"
        }console.log(Thisrow);
    }
}
Pattern(5);

// o/p
// *0000
// 0*000
// 00*00
// 000*0
// 0000*