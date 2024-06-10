var arr = [10, 20, 30, 40];
function PrintAllSubArray(arr) {
    var n = arr.length;
    for (var sp = 0; sp < n; sp++) {
        for (var ep = sp; ep < n; ep++) {
            var s = '';
            for (var i = sp; i <= ep; i++) {
                s += arr[i] + ', ';
            }
            console.log(s);
        }
    }
}
PrintAllSubArray(arr);
