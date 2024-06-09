function Daimond(row) {
    var star = 1;
    var spaces = Math.floor(row / 2);
    for (var line = 1; line <= row; line++) {
        var s = '';
        for (var j = 1; j <= spaces; j++) {
            s += ' ';
        }
        for (var j = 1; j <= star; j++) {
            s += '*';
        }
        console.log(s);
        if (line <= row / 2) {
            star += 2;
            spaces--;
        }
        else {
            star -= 2;
            spaces++;
        }
    }
}
Daimond(5);
