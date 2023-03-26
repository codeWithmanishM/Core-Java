


	//package com.tp.practice;
	//package Vehicle;
	import java.util.*;


	class Vehicle
	{
		public static void list()
		{
			System.out.println("***");
			System.out.println("Welcome To Showroom");
			System.out.println("Enter 2 for Two wheeler");
			System.out.println("Enter 3 for Three wheeler");
			System.out.println("Enter 4 for Four wheeler");
			System.out.println("Enter 6 for Six wheeler");
			
		}
		
	}
	class Twov extends Vehicle
	{
		public static void two() 
		{
		System.out.println("Enter 1 for Cycle ");
		System.out.println("Enter 2 for Bike ");
		}
	}

	class cycle extends Twov
	{
		int price = 18000;
		
		public static void cyc()
		{
			System.out.println("Cycle Name : HERO");
		}
		
	}
	class bike extends Twov
	{	
		public static void bik()
		{
			System.out.println("Enter 1 for Electric bike");
			System.out.println("Enter 2 for Petrol Bike");
		}
	}

	class Electric extends bike
	{	
		public static void ele()
		{
			System.out.println("Enter 1 for Hero");
			System.out.println("Enter 2 for Mareno");
			System.out.println("Enter 3 for OLA");
		}
		
	}

	class Petrol extends bike
	{
	   
		public static void pet()
		{
			System.out.println("Enter 1 for Super-Splender");
			System.out.println("Enter 2 for Shine");
			System.out.println("Enter 3 for Royal Enfield");
		}

	}


	class Hero extends Electric 
	{
		int price = 92000;
		String Color = "Red,Black,White";
		String Capacity = "200KM/hr";
		
		public static void her()
		{
			System.out.println("Model Name : Hero Electric Optima");
			Hero ref = new Hero();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
		
	}
	class color extends Hero
	{
		public static void color()
		{
			String color = "Red, Black, white";
		}
	}


	class Mareno extends Electric 
	{
		int price = 75000;
		String Color = "Red,Black,White";
		String Capacity = "250KM/hr";
		
		public static void mar()
		{
			System.out.println("Model Name : Mareno Electric Atria");
			Mareno ref = new Mareno();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
	}



	class Ola extends Electric 
	{
		int price = 85000;
		String Color = "Red,Black,White";
		String Capacity = "270KM/hr";
		
		public static void ola()
		{
			System.out.println("Model Name : Ola Electric Photon");
			Ola ref = new Ola();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
	}

	class Supersp extends Petrol
	{
		int price = 100000;
		String Color = "Red,Black";
		String Capacity = "270KM/hr";
		
		public static void sup()
		{
			System.out.println("Model Name : Super-Splender i3S");
			Supersp ref = new Supersp();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
		
	}

	class Shine extends Petrol
	{
		int price = 110000;
		String Color = "Red,Blue";
		String Capacity = "250KM/hr";
		
		public static void shi()
		{
			System.out.println("Model Name : Shine CB");
			Shine ref = new Shine();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
		
	}

	class Royal extends Petrol
	{
		int price = 225000;
		String Color = "Gray,Red,Black";
		String Capacity = "280 KM/hr";
		
		public static void roy()
		{
			System.out.println("Model Name : Royal Enfield Meteor 350");
			Royal ref = new Royal();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.Capacity);
		}
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//	                              Two Wheeler end


	class Threev extends Vehicle 
	{
		public static void thr()
		{
			System.out.println("Enter 1 for Auto-Rickshaw");
			System.out.println("Enter 2 for Tempo");
		}

	}

	class Auto extends Threev
	{
		int price = 300000;
		String Color = "Black, Pink";
		String capacity = "100 KM/hr";
		
		public static void aut()
		{
			System.out.println("Bajaj Compact");
			Auto ref = new Auto();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
		
	}

	class Tempo extends Threev
	{
		int price = 350000;
		String Color = "Black, Pink, Red";
		String capacity = "100 KM/hr";
		
		public static void tem()
		{
			System.out.println("Mahindra After Plus");		
			Tempo ref = new Tempo();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
		
	}



	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//										Three Wheeler end




	class Fourv extends Vehicle 
	{
		public static void four()
		{
			System.out.println("Enter 1 for Petrol Car");
			System.out.println("Enter 2 for Diesel Car");
			System.out.println("Enter 3 for Electric Car");
			
		}

	}

	class Petrolcar extends Fourv
	{
		public static void pet() 
		{
		System.out.println("Enter 1 for  XUV 700 Car");
		System.out.println("Enter 2 for  Brezza Car");
		System.out.println("Enter 3 for  Dzire Car");
		}
	}

	class XUV extends Petrolcar
	{
		int price = 1000000;
		String Color = "Black, White, Red";
		String capacity = "310 KM/hr";
		
		public static void xuv()
		{
			System.out.println("XUV 700 Car");	
			XUV ref = new XUV();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}

	class Brezza extends Petrolcar
	{
		int price = 1200000;
		String Color = "Black, White, Gray";
		String capacity = "300 KM/hr";
		
		public static void bre()
		{
			System.out.println("Brezza Car");	
			Brezza ref = new Brezza();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}

	class Dzire extends Petrolcar
	{
		int price = 800000;
		String Color = "Black, White, Maroon";
		String capacity = "330 KM/hr";
		
		public static void diz()
		{
			System.out.println("Dzire Car");
			Dzire ref = new Dzire();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}
	//--------------------------------


	class Dieselcar extends Fourv
	{
		public static void die() 
		{
		System.out.println("Enter 1 for  Mahindra Bolero Car");
		System.out.println("Enter 2 for  Scorpio Car");
		System.out.println("Enter 3 for  Toyota Fortuner Car");
		}
	}

	class Mahindra extends Dieselcar
	{
		int price = 1500000;
		String Color = "White, Gray, Black";
		String capacity = "420 KM/hr";
		
		public static void mah()
		{
			System.out.println("Mahindra Bolero Car");	
			Mahindra ref = new Mahindra();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
		
	}

	class Scorpio extends Dieselcar
	{
		int price = 1600000;
		String Color = "White, Red, Black";
		String capacity = "425 KM/hr";
		
		public static void sco()
		{
			System.out.println("Scorpio Car");	
			Scorpio ref = new Scorpio();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
		
	}

	class Toyota extends Dieselcar
	{
		int price = 2000000;
		String Color = "Blue, Gray, Red";
		String capacity = "450 KM/hr";
		
		public static void toy()
		{
			System.out.println("Toyota Fortuner Car");	
			Toyota ref = new Toyota();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
		
	}


	//-------------------------------



	class Electriccar extends Fourv
	{
		public static void elec() 
		{
		System.out.println("Enter 1 for Tesla Car");
		System.out.println("Enter 2 for Nexon Car");
		System.out.println("Enter 3 for kia Car");
		}
	}

	class Tesla extends Electriccar
	{
		int price = 1500000;
		String Color = "Blue, White";
		String capacity = "300 KM/hr";
		
		public static void tes()
		{
			System.out.println("Car Name : Tesla Cybertruck");
			Tesla ref = new Tesla();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}

	class Nexon extends Electriccar
	{
		int price = 1400000;
		String Color = "Blue, White, Black";
		String capacity = "350 KM/hr";
		
		public static void nex()
		{
			System.out.println("Car Name : Tata Nexon EV MAX ");
			Nexon ref = new Nexon();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}

	class Kia extends Electriccar
	{
		int price = 1400000;
		String Color = "Blue, White";
		String capacity = "370 KM/hr";
		
		public static void kia()
		{
			System.out.println("Car Name : Kia EV6 ");
			Kia ref = new Kia();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}
	class sixv extends Vehicle
	{
		public static void six()
		{
			System.out.println("Enter 1 for Diesel Truck");
			System.out.println("Enter 2 for Electric Truck");
			
		}
	}
	class DieselTruck extends sixv
	{
		public static void die() 
		{
		System.out.println("Enter 1 for  AshokLeyland Truck ");
		System.out.println("Enter 2 for TATA Truck");
		System.out.println("Enter 3 for BHARATBENZ TRuck ");
		}
	}
	class AshokLeyland extends DieselTruck
	{
		int price = 850000;
		String Color = "Black, White, blue";
		String capacity = "180 KM/hr";
		
		public static void AshokLeyland()
		{
			System.out.println("AshokLeyland Truck");	
			AshokLeyland ref = new AshokLeyland();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}
	
	class TATA extends DieselTruck
	{
		int price = 900000;
		String Color = "Black, White, Gray";
		String capacity = "200 KM/hr";
		
		public static void TATA()
		{
			System.out.println("TATA Truck");	
			TATA ref = new TATA();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}
	}
	class BHARATBENZ extends DieselTruck
	{
		int price = 950000;
		String Color = "Black, White, Red";
		String capacity = "230 KM/hr";
		
		public static void bharatb()
		{
			System.out.println("BHARATBENZ TRUCK");	
			BHARATBENZ ref = new BHARATBENZ();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
		}

	
	}

//-------------------------------------------------------------------------------------------------
     
	class ElectricTruck extends sixv
	{
		public static void elec() 
		{
		System.out.println("Enter 1 for volvo Truck");
		System.out.println("Enter 2 for scania Truck");
		}
	}
	class Volvo extends ElectricTruck
	{
		int price = 1950000;
		String Color = "Blue, White";
		String capacity = "40 tonnes";
		String range = "300km";
		String chargingtime = "2.5 hour";
		
		public static void volvo()
		{
			System.out.println("Truck Name : volvo ElectricTruck");
			Volvo ref = new Volvo();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
			System.out.println("range  : " + ref.range);
			System.out.println("chargingtime  : " + ref.chargingtime);
		}
	}
	class Scania extends ElectricTruck
	{
		int price = 1900000;
		String Color = "Black, White";
		String capacity = "40 tonnes";
		String range = "250km";
		String chargingtime = "2.5 hour";
		
		public static void scania()
		{
			System.out.println("Truck Name : scania ElectricTruck");
			Scania ref = new Scania();
			System.out.println("Price : " + ref.price);
			System.out.println("Colours Available  : " + ref.Color);
			System.out.println("Capacity  : " + ref.capacity);
			System.out.println("range  : " + ref.range);
			System.out.println("chargingtime  : " + ref.chargingtime);
		}
	}

	//*** Login ****

	class Login 
	{
		static private String Fname ;
		static private String Lname ; 
		static protected String Pass  ;
		static protected long MobNo ;
		static int age;
		static  protected int amt = 2500000;
		
		public static void Login()
		{
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Your First Name");
			Fname = s.next();
			System.out.println("Enter Your Last Name");
			Lname = s.next();
			System.out.println("Enter Your Age Name");
			age = s.nextInt();
			
			if ( age <18) 
			{
				System.out.println("You can only buy Cycle ");
			}
			else if(age >18 && age<80)
			{
				System.out.println("You are Ready To Drive....");
			}	
			else
			{
				System.out.println("Wrong input...Enter Correct Age");
				Login();
			}
			
			
			System.out.println("Enter Your Contact Number");
			MobNo = s.nextLong();
			
			int Count = len(MobNo);
			if (Count != 10) 
			{
				
				System.out.println("@@@@@ Contact Number is incorrect @@@@@");
				System.out.println("@@@@@ Please try again @@@@@ ");
				Login();
			}
			
			System.out.println("Enter Your Password ");
			Pass = s.next();
			
			System.out.println("Confirm Password");
			String temppass = s.next();
			
			if(Pass.equals(temppass))
			{
				System.out.println("Login Successful -->");
				
	 			System.out.println("Hello "+Fname+" "+ Lname + " ");
				System.out.println("Your Current Account Balance is : "+amt);
			}
			else
			{
				System.out.println("");
				System.out.println("---- Password does not matched ----");
				System.out.println("Please Try again -->");
				Login();
			}
			
	    }//Login ends
		
		
		public static int len(long l)
		{
			String s = Long.toString(l);
			
			int count = s.length();
			
			return count;
			
		}
		
		
	}


	//*** Buy ****


	class Buy
	{
		public static void buy() 
		{	
			Login l = new Login();	
			Scanner s = new Scanner(System.in);
		
			System.out.print("----");
			System.out.println("Enter B to Buy ");
			System.out.print("----");
			System.out.println("OR");
			System.out.print("----");
			System.out.println("Enter any key to exit");
			System.out.print("----");
			String B = s.next();
			String B1 = "B";
			String B2 = "b";
			if (B.equals(B1) || B.equals(B2))
			{
				System.out.println("Enter Mobile Number");
				long Temp1 = s.nextLong();

				System.out.println("Enter Password");
				String Temp2 = s.next();
				
				if (Temp1 != l.MobNo) 
				{
					System.out.println("Mobile Number is Incorrect");
					System.out.println("Please try again ");
				} 
				else if(!Temp2.equals(l.Pass))
				{
					System.out.println("Password is Incorrect");
					System.out.println("Please try again ");
				}
				else
				{
					System.out.println();
					System.out.println("~~ Congratulations....!!!  ~~");
					
				System.out.println("Your current Balance is : ");
					
				}
			} 
			else 
			{
				Driver d = new Driver();
				d.main(null);
				
			}
		}

	}



	//*** DRIVER ****



	public class Driver {
		
		static
		{
			Login l = new Login();
			System.out.println("** Welcome **");
			l.Login();
		
		}

		public static void main(String[] args) 
		{
			
			while(true) {

				Vehicle v = new Vehicle();
				Buy BUY = new Buy();
				v.list();
				Scanner sc = new Scanner(System.in);
				System.out.print("** Enter Input : ");
				int val = sc.nextInt();
				System.out.println("--->");
				
				switch (val) {
				case 2: 
					Twov t = new Twov();
					t.two();
					System.out.print("Enter Input : ");
					int t1 = sc.nextInt();
					System.out.println("--->");
					switch(t1)
					{
						case 1:
							cycle c = new cycle(); 
							c.cyc();
							System.out.println("Cycle Price : " + c.price);
							BUY.buy();
							break;
							
						case 2:
							
							bike b = new bike();
							b.bik();
							System.out.println("Enter Input : ");
							int b1 = sc.nextInt();
							if (b1==1) 
							{
								Electric e = new Electric();
								e.ele();
								System.out.print("Enter Input : ");
								int b3 = sc.nextInt();
								System.out.println("--->");
								switch(b3)
								{
								case 1 : 
									Hero H = new Hero();
									
									H.her();
									
									BUY.buy();
									
									
									break;
									
								case 2 : 
									Mareno m = new Mareno();
																
									m.mar();
									
									BUY.buy();
									
									break;
									
								case 3 :
									
									Ola o = new Ola();
								
									o.ola();
									
									BUY.buy();
									
									break;
								
								}
								
								
							}	
							else if (b1==2)
							{
								Petrol p = new Petrol();
								p.pet();
								System.out.print("Enter Input : ");
								int p1 = sc.nextInt();
								System.out.println("--->");
								
								switch(p1)
								{
								case 1 : 
									Supersp s = new Supersp();
									
									s.sup();
									
									BUY.buy();
									
									break;
								case 2 : 
									Shine sh = new Shine();
																
									sh.shi();
									
									BUY.buy();
									
									break;
									
								case 3 :
									
									Royal ro = new Royal();
								
									ro.roy();
									
									BUY.buy();
									
									break;
								default:
									System.out.println("Please Enter Proper Input ");
									break;
								
								}
							
								
							}
							
							break;
							
					}
					 break;
			// TWO wheelar Ends	
			// Three wheelar starts		 
				case 3: 
					Threev tv = new Threev();
					tv.thr();
					System.out.print("Enter Input : ");
					int t2 = sc.nextInt();
					System.out.println("--->");
					
					switch (t2) 
					{
					case 1:
						Auto a = new Auto();
						a.aut();
						BUY.buy();					
						break;

					case 2:
						Tempo te = new Tempo();
						te.tem();;
						BUY.buy();
						break;
						
					default:
						System.out.println("Please Enter Proper Input ");
						break;
					}
					
					
					break;
					// Three wheeler Ends
					
			    // Four wheeler starts	
				case 4: 
					Fourv fv = new Fourv();
					fv.four();
					System.out.print("Enter Input : ");
					int t3 = sc.nextInt();
					System.out.println("--->");
					
					switch(t3)
					{
					case 1 :
						Petrol pe = new Petrol();
						pe.pet();
						System.out.print("Enter Input : ");
						int p = sc.nextInt();
						System.out.println("--->");
						
						switch(p)
						{
						case 1:
							XUV xu = new XUV();
							xu.xuv();
							BUY.buy();
							
							break;
							
						case 2 : 
							Brezza br = new Brezza();
							br.bre();
							BUY.buy();
							
							break;
							
						case 3 : 
							Dzire dz = new Dzire();
							dz.diz();
							BUY.buy();
							
							break;
							
						default:
							System.out.println("Please Enter Proper Input ");
							break;
								
						
						}
						
						
						
						
						break;
						
					case 2:
						Dieselcar di = new Dieselcar();
						di.die();
						System.out.print("Enter Input : ");
						int D = sc.nextInt();
						System.out.println("--->");
						
						switch(D)
						{
						case 1:
							Mahindra ma = new Mahindra();
							ma.mah();
							BUY.buy();
							
							break;
							
						case 2 : 
							Scorpio sco = new Scorpio();
							sco.sco();
							BUY.buy();
							
							break;
							
						case 3 : 
							Toyota to = new Toyota();
							to.toy();
							BUY.buy();
							
							break;
							
						default:
							System.out.println("Please Enter Proper Input ");
							break;
								
					
						}
				
						break;
						
					case 3 : 
		//****************
						Electriccar ec = new Electriccar();
						ec.elec();
						System.out.print("Enter Input : ");
						int E = sc.nextInt();
						System.out.println("--->");
						
						switch(E)
						{
						case 1:
							Tesla te = new Tesla();
							te.tes();
							BUY.buy();
							
							break;
							
						case 2 : 
							Nexon ne = new Nexon();
							ne.nex();
							BUY.buy();
							
							break;
							
						case 3 : 
							Kia ki = new Kia();
							ki.kia();
							BUY.buy();
							
							break;
							
						default:
							System.out.println("Please Enter Proper Input ");
							break;
								
					
						}
				
						break;
		//****************
						
					default:
						System.out.println("Please Enter Proper Input ");
						break;
					}
					
					//four wheeler ends
					//six wheeler starts
					
				case 6:
					sixv sv = new sixv();
					sv.six();
					System.out.println("Enter Input:");
					int t6 =sc.nextInt();
					System.out.println("---->");
					
					switch(t6)
					{
					case 1:
						DieselTruck di=new DieselTruck();
						di.die();
						System.out.println("Enter Input:");
						int D = sc.nextInt();
						System.out.println("----->");
						switch(D)
						{
						case 1:
							AshokLeyland al =  new AshokLeyland();
							al.AshokLeyland();
							BUY.buy();
							break;
					    case 2:
							TATA ta=new TATA();
							ta.TATA();
							BUY.buy();
							break;
						case 3:
							BHARATBENZ bz = new BHARATBENZ();
							bz.bharatb();
							BUY.buy();
							break;
							
							default:
								System.out.println("please enter proper input");
								break;
						}
						break;
					case 2:
						  ElectricTruck ec = new ElectricTruck();
						  ec.elec();
						  System.out.println("Enter Input");
						  int E = sc.nextInt();
						  System.out.println("------>");
						  switch(E)
						  {
						  case 1:
							  Volvo vo = new Volvo();
							  vo.volvo();
							  BUY.buy();
							 break;
						  case 2:
						  Scania sn = new Scania();
							  sn.scania();
							  BUY.buy();
							  break;
						  }
					}
				
					
				break;
				
				default:
					System.out.println("Please Enter Proper Input ");
					break;
				
				}// switch End
				
				
			}//while end
		
			
		}//main end

	}// Driver end

