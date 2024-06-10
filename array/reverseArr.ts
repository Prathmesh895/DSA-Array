let arr:number[]=[1,2,3,4,5,6,7,8,9];

function ReverseArr(arr:number[]):number[]{
    let r=arr.length-1;
    let l=0;

    while(l<r){
        let temp =arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        
        l++;
        r--;
    }
    return arr;
}

console.log(ReverseArr(arr))
