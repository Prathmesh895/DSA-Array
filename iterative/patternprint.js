// function Pattern(row:number):void{
//     for(let line =1;line<=row;line++){
//         let s:string = "";
//             for( let j=1;j<=line;j++){
//                 s +="*";
//             } console.log(s); 
//     } 
// }
// Pattern(5);
// function reverseStar(row:number):void{
//     for(let i=row;i>=1;i--){
//         let s:string="";
//         for(let j=1;j<=i;j++){
//             s+="*";
//         }
//         console.log(s);
//     }
// }
// reverseStar(6);
// function starPattern(row:number):void{
//     for(let line=1;line<=row;line++){
//         let star=line;
//         let spaces=row-line;
//         let s="";
//         for(let j=1;j<=spaces;j++){
//             s+=' ';
//         }
//         for(let j=1;j<=star;j++){
//             s+='*'
//         }
//         console.log(s)
//     }
// }
// starPattern(5);
function Diagonal(row) {
    for (var line = 1; line <= row; line++) {
        var spaces = line - 1;
        var stars = line - spaces;
        var s = '';
        for (var j = 1; j <= spaces; j++) {
            s += " ";
        }
        for (var j = 1; j <= stars; j++) {
            s += '*';
        }
        console.log(s);
    }
}
Diagonal(5);
