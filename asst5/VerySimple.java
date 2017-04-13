// prints out the literal 3 to the terminal, using 'super' so that dynamic
// dispatch is not necessary
class Main extends Lib {
    public void main() {
    	int xyz = 123;
    	int abc = xyz + 30;
    	printInt(abc + 6);
    	printStr("\n");
    }
}
