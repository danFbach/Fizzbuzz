package fizzBuzz;

public class FizzBuzzMain {

	public static void main(String[] args) {
		
		FourTest fizz = new FourTest();
		SevenTest buzz = new SevenTest();		

		Double fizzPrint;
		Double buzzPrint;
		
		
				
		
		Double inNum = 0.0;{


			
			
			while(inNum < 101){
				fizzPrint = fizz.numCheck(inNum);
				buzzPrint = buzz.numCheck(inNum);
				
				if(fizzPrint == 0 && buzzPrint == 0){
					System.out.println("fizzbuzz");
				}else if(fizzPrint == 0){
						System.out.println("fizz");
				}else if(buzzPrint == 0){
						System.out.println("buzz");
				}else {
						System.out.println(inNum);
						}
			
						
				inNum++;
				
			}
		}
	}
}
