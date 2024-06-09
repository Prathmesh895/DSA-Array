var array = [2, 3, 4, 5, 2, 5, 8];
function Addition(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    console.log(sum);
}
Addition(array);
