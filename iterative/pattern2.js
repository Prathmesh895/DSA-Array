function Pattern(n) {
    for (var row = 1; row <= n; row++) {
        var Thisrow = "";
        for (var col = 1; col <= n; col++) {
            if (row == col)
                Thisrow += "*";
            else
                Thisrow += "0";
        }
        console.log(Thisrow);
    }
}
Pattern(5);
