package day7.MailStoopNumber;
import java.util.Scanner;
public class MailStopNumber {

	public static void main(String[] args) {
		int generatedNumber = -1;
		int choice = 1;
		int arr[] = new int[100];
		arr[0] = -1;
		String floor = "ATM-100-02";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(choice != 3)
		{
			if(count != 100)
			{
				System.out.println("Selected Floor: "+floor);
				System.out.println("1.GENERATED NUMBER");
				System.out.println("2.CUSTOM NUMBER?");
				System.out.println("3.EXIT");
				System.out.println("Choose one of the Option: ");
				int input = sc.nextInt();
				if(input == 3)
				{
					break;
				}
				else if(input == 2)
				{
					System.out.println("Enter your customer between 00 to 99");
					int customMailStopNumer = sc.nextInt();
					if((customMailStopNumer >= 0) && (customMailStopNumer <= 99))
					{
						if((customMailStopNumer == 0) && (arr[customMailStopNumer] == -1))
						{
							arr[customMailStopNumer] = customMailStopNumer;
							count++;
							System.out.println("Number Saved");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						else if((customMailStopNumer != 0)&&(arr[customMailStopNumer] != 0))
						{
							System.out.println(customMailStopNumer+" Has Already occupied.");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						else
						{
							arr[customMailStopNumer] = customMailStopNumer;
							count++;
							System.out.println("Number Saved");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					else
					{
						System.out.println("Not a Valid Number");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else if(input == 1)
				{
					if(arr[0] == -1)
					{
						generatedNumber = 0;
						System.out.println("Generated Number: 0"+generatedNumber);
						arr[generatedNumber] = generatedNumber;
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count++;
					}
					else
					{
						for(int i = 1; i < 100; i++)
						{
							if(arr[i] == 0)
							{
								generatedNumber = i;
								if(i < 10)
								{
									System.out.println("Generated Number: 0"+i);
									arr[generatedNumber] = generatedNumber;
									count++;
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									System.out.println("Generated Number: "+i);
									arr[generatedNumber] = generatedNumber;
									count++;
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
										
									}
									break;
								}
							}
						}
					}
				}
				
			}
			else
			{
				System.out.println("Max Limit Reached for MailStopNumber");	
				break;
				
			}
		}
		
		

	}

}
