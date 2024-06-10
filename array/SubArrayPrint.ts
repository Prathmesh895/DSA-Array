let arr:number[]= [10,20,30,40];

function PrintAllSubArray(arr:number[]):void{
    let n = arr.length;
    for(let sp=0;sp<n;sp++){
        for(let ep=sp;ep<n;ep++){
            let s='';
            for(let i=sp;i<=ep;i++){
                s+= arr[i] + ', '
            }
            console.log(s)
        }
    }
}
PrintAllSubArray(arr)