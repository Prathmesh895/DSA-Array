// let arr:number[] = [6,3,5,2,1,3,7,4,1];
// function getmax(arr:number[]):number{
//     let maxi =-Infinity;
//     for(let i =0;i<arr.length;i++){
//         if(maxi <arr[i]){
//             maxi= arr[i]
//         }
//     }
//     return maxi;
// }
// // console.log(getmax(arr));
// function PrintBarChart(arr:number[]):void{
//     let n = arr.length;
//     let maxi = getmax(arr);
//     for(let floor=maxi;floor>=1;floor--){
//         let s="";
//         for(let i = 0; i < n; i++){
//             if(arr[i] >= floor){
//                 s+="*";
//             }else s+="-";
//         }
//         console.log(s);
//     }
// }
// PrintBarChart(arr);
var arr = [6, 3, 5, 2, 1, 3, 7, 4, 1];
function getMax(arr) {
    var maxi = -Infinity;
    for (var i = 0; i < arr.length; i++) {
        if (maxi < arr[i]) {
            maxi = arr[i];
        }
    }
    return maxi;
}
console.log(getMax(arr));
function PrintBarChart(arr) {
    var n = arr.length;
    var maxi = getMax(arr);
    for (var floor = maxi; floor >= 1; floor--) {
        var s = "";
        for (var i = 0; i < n; i++) {
            if (arr[i] >= floor) {
                s += "*";
            }
            else
                s += "-";
        }
        console.log(s);
    }
}
PrintBarChart(arr);
