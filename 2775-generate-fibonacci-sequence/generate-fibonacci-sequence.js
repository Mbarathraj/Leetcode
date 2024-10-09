/**
 * @return {Generator<number>}
 */
function* fibGenerator() {
    let a = 0, b = 1;
    while (true) {
        yield a; // Yield the current Fibonacci number
        [a, b] = [b, a + b]; // Update a and b for the next Fibonacci number
    }
}


/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */