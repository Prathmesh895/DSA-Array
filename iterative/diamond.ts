function Daimond(row: number): void {
    let star = 1;
    let spaces = Math.floor(row / 2);
    for (let line = 1; line <= row; line++) {
        let s: string = '';
        for (let j = 1; j <= spaces; j++) {
            s += ' ';
        }
        for (let j = 1; j <= star; j++) {
            s += '*';
        }
        console.log(s);
        if (line <= row / 2) {
            star += 2;
            spaces--;
        } else {
            star -= 2;
            spaces++;
        }
    }
}
Daimond(5);

// o/p
//   *
//  ***
// *****
//  ***
//   *