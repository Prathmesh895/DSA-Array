
function maxOccure(n:number,d:number):number{
    let count =0;
    while(n>0){
        let CurrentDigit= n%10;
        if(CurrentDigit==d) count++;
        n=Math.floor(n/10);
    }
    return count;
}
console.log(maxOccure(33213232,2));
