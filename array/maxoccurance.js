function maxOccure(n, d) {
    var count = 0;
    while (n > 0) {
        var CurrentDigit = n % 10;
        if (CurrentDigit == d)
            count++;
        n = Math.floor(n / 10);
    }
    return count;
}
console.log(maxOccure(33213232, 2));
