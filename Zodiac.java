import java.util.*;




class Zodiac
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int date=0,mm=0,y=0,t;
        System.out.println("*********************************************Zodiac Signs*********************************************");
        do
        {
        System.out.println("\t\t\tEnter your good name");
        name=in.next();
        System.out.println("\t\t\tEnter your date of birth");
        System.out.println("\t\t\tEnter your date");
        date=in.nextInt();
        System.out.println("\t\t\tEnter your month");
        mm=in.nextInt();
        System.out.println("\t\t\tEnter your year");
        y=in.nextInt();
        if(date>=1&&date<=31)
        {
        if(y>=1948&&y<=2018)
        {
        if(mm==1||mm==2||mm==3||mm==4||mm==5||mm==6||mm==7||mm==8||mm==9||mm==10||mm==11||mm==12)
        {
            
                if(mm==1)
                {
                    if(date>=1&&date<=19)
                    {
                    System.out.println("Your Zodiac Sign is : Capricorn");
                    System.out.println("Your Birth stone is : Garnet");
                    System.out.println("Your Positive characters are : Practical,Ambitious,Disciplined");
                    System.out.println("Your Negative characters are : Stubborn,Shy,Self-centered");
                    System.out.println("Your element is : Earth");
                    System.out.println("Your lucky colours are : Brown,Black");
                    System.out.println("Your lucky numbers are : 4,8,13,22");
                    System.out.println("Your lucky day is : Saturday");
                    System.out.println("Your ruling planet is : Saturn");
                    System.out.println("Famous personalities born in this month are : Swami Vivekananda,Deepika Padukone");
                }
                else if(date>=20&&date<=31)
                {
                System.out.println("Your Zodiac Sign is : Aquarius");
                    System.out.println("Your Birth stone is : Amethyst");
                    System.out.println("Your Positive characters are : Friendly,Intelligent,Inventive");
                    System.out.println("Your Negative characters are : Unpredictable,Stubborn,Extremist");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Light blue,silver");
                    System.out.println("Your lucky numbers are : 4,7,11,22,29");
                    System.out.println("Your lucky day is : Saturday");
                    System.out.println("Your ruling planet is : Uranus");
                    System.out.println("Famous personalities born in this month are : Swami Vivekananda,Deepika Padukone");
                }
            }
                
               else if(mm==2)
                {
                    if(date>=1&&date<=18)
                   
                   {
                System.out.println("Your Zodiac Sign is : Aquarius");
                    System.out.println("Your Birth stone is : Amethyst");
                    System.out.println("Your Positive characters are : Friendly,Intelligent,Inventive");
                    System.out.println("Your Negative characters are : Unpredictable,Stubborn,Extremist");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Light blue,silver");
                    System.out.println("Your lucky numbers are : 4,7,11,22,29");
                    System.out.println("Your lucky day is : Saturday");
                    System.out.println("Your ruling planet is : Uranus");
                    System.out.println("Famous personalities born in this month are : Jayalalitha Jayaram,Abhishek Bachchan");
                }
                else if(y%4==0&&date>=19&&date<=29)
                {
                System.out.println("Your Zodiac Sign is : Pisces");
                    System.out.println("Your Birth stone is : Aquamarine");
                    System.out.println("Your Positive characters are : Imaginative,Kind,Selfless");
                    System.out.println("Your Negative characters are : Lazy,Oversensitive,Weak willed");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Lilac,Purple,Violet,Sea green");
                    System.out.println("Your lucky numbers are : 3,9,12,15,18,24");
                    System.out.println("Your lucky day is : Thursday");
                    System.out.println("Your ruling planets are : Neptune,Jupiter");
                    System.out.println("Famous personalities born in this month are : Jayalalitha Jayaram,Abhishek Bachchan");
                }
                
                    else if(y%4!=0&&date>=19&&date<=28)
                    {
                        System.out.println("Your Zodiac Sign is : Pisces");
                    System.out.println("Your Birth stone is : Aquamarine");
                    System.out.println("Your Positive characters are : Imaginative,Kind,Selfless");
                    System.out.println("Your Negative characters are : Lazy,Oversensitive,Weak willed");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Lilac,Purple,Violet,Sea green");
                    System.out.println("Your lucky numbers are : 3,9,12,15,18,24");
                    System.out.println("Your lucky day is : Thursday");
                    System.out.println("Your ruling planets are : Neptune,Jupiter");
                    System.out.println("Famous personalities born in this month are : Jayalalitha Jayaram,Abhishek Bachchan");
                }
                else 
                System.out.println("The date or year eneterd is wrong as febraury has only 28 days and 29 days during leap year"); 
                
            }
        
             else if(mm==3)
                   {
                       if(date>=1&&date<=19)
                       {
                System.out.println("Your Zodiac Sign is : Pisces");
                    System.out.println("Your Birth stone is : Aquamarine");
                    System.out.println("Your Positive characters are : Imaginative,Kind,Selfless ");
                    System.out.println("Your Negative characters are : Lazy,Oversensitive,Weak willed");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Lilac,Purple,Violet,Sea green");
                    System.out.println("Your lucky numbers are : 3,9,12,15,18,24");
                    System.out.println("Your lucky day is : Thursday");
                    System.out.println("Your ruling planets are : Neptune,Jupiter");
                    System.out.println("Famous personalities born in this month are : Aamir Khan,Kalpana Chawla");
                }
                else if(date>=20&&date<=31)
                {
                     
                System.out.println("Your Zodiac Sign is : Aries");
                    System.out.println("Your Birth stone is : Diamond");
                    System.out.println("Your Positive characters are : Brave,Courageous,Very frank and outspoken");
                    System.out.println("Your Negative characters are : Arrogant,Stubborn,Tendency to leave projects midway");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colour is : Red");
                    System.out.println("Your lucky numbers are : 1,8,17");
                    System.out.println("Your lucky day is : Tuesday");
                    System.out.println("Your ruling planet is : Mars");
                    System.out.println("Famous personalities born in this month are : Aamir Khan,Kalpana Chawla");
                }
            }
            else if(mm==4)
            {
                if(date>=17&date<=18)
                {
                    System.out.println("Your Zodiac Sign is : Aries");
                    System.out.println("Your Birth stone is : Diamond");
                    System.out.println("Your Positive characters are : Brave,Courageous,Very frank and outspoken");
                    System.out.println("Your Negative characters are : Arrogant,Stubborn,Tendency to leave projects midway");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colour is : Red");
                    System.out.println("Your lucky numbers are : 1,8,17");
                    System.out.println("Your lucky day is : Tuesday");
                    System.out.println("Your ruling planet is : Mars");
                    System.out.println("Famous personalities born in this month are : Emma Watson,Robert Downey Jr");
                }
                else if(date>=19&&date<=30)
                {
                    System.out.println("Your Zodiac Sign is : Taurus");
                    System.out.println("Your Birth stone is : Emerald");
                    System.out.println("Your Positive characters are : Generous,Patient,Persistant");
                    System.out.println("Your Negative characters are : Possesive,Lazy,Stubborn");
                    System.out.println("Your element is : Earth");
                    System.out.println("Your lucky colours are : Green,Pink");
                    System.out.println("Your lucky numbers are : 2,6,9,12,24");
                    System.out.println("Your lucky days are : Friday,Monday");
                    System.out.println("Your ruling planet is : Venus");
                    System.out.println("Famous personalities born in this month are : Emma Watson,Robert Downey Jr");
                }
            }
            else if(mm==5)
            {
                if(date>=1&&date<=19)
                {
                    System.out.println("Your Zodiac Sign is : Taurus");
                    System.out.println("Your Birth stone is : Emerald");
                    System.out.println("Your Positive characters are : Generous,Patient,Persistant");
                    System.out.println("Your Negative characters are : Possesive,Lazy,Stubborn");
                    System.out.println("Your element is : Earth");
                    System.out.println("Your lucky colours are : Green,Pink");
                    System.out.println("Your lucky numbers are : 2,6,9,12,24");
                    System.out.println("Your lucky days are : Friday,Monday");
                    System.out.println("Your ruling planet is : Venus");
                    System.out.println("Famous personalities born in this month are : Rabindranath Tagore,Madhuri Dixit");
                }
                else if(date>=20&&date<=31)
                {
                    System.out.println("Your Zodiac Sign is : Gemini");
                    System.out.println("Your Birth stone is : Alexandrite");
                    System.out.println("Your Positive characters are : Sensitive,Soft spoken,Enthusiastic");
                    System.out.println("Your Negative characters are : Anxious,Lack of decision making ability,Superficial");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Light green,Yellow");
                    System.out.println("Your lucky numbers are : 5,7,14,23");
                    System.out.println("Your lucky day is : Wednesday");
                    System.out.println("Your ruling planet is : Mercury");
                    System.out.println("Famous personalities born in this month are : Rabindranath Tagore,Madhuri Dixit");
                }
            }
            else if(mm==6)
            {
                if(date>=1&&date<=20)
                {
                System.out.println("Your Zodiac Sign is : Gemini");
                    System.out.println("Your Birth stone is : Alexandrite");
                    System.out.println("Your Positive characters are : Sensitive,Soft spoken,Enthusiastic");
                    System.out.println("Your Negative characters are : Anxious,Lack of decision making ability,Superficial");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Light green,Yellow");
                    System.out.println("Your lucky numbers are : 5,7,14,23");
                    System.out.println("Your lucky day is : Wednesday");
                    System.out.println("Your ruling planet is : Mercury");
                    System.out.println("Famous personalities born in this month are : Angelina Jolie,Mel brooks");
                }
                else if(date>=21&&date<=30)
                {
                System.out.println("Your Zodiac Sign is : Cancer");
                    System.out.println("Your Birth stone is : Ruby");
                    System.out.println("Your Positive characters are : Creative,Spontaneous,Faithfull,Loving");
                    System.out.println("Your Negative characters are : Moody,Overemotional,Suspicious");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colour is : White");
                    System.out.println("Your lucky numbers are : 2,3,15,20");
                    System.out.println("Your lucky days are : Monday,Thursday");
                    System.out.println("Your ruling planet is : Moon");
                    System.out.println("Famous personalities born in this month are : Angelina Jolie,Mel brooks");
                }
            }
            else if(mm==7)
            {
                if(date>=1&&date<=21)
                {
                    System.out.println("Your Zodiac Sign is : Cancer");
                    System.out.println("Your Birth stone is : Ruby");
                    System.out.println("Your Positive characters are : Creative,Spontaneous,Faithfull,Loving");
                    System.out.println("Your Negative characters are : Moody,Overemotional,Suspicious");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colour is : White");
                    System.out.println("Your lucky numbers are : 2,3,15,20");
                    System.out.println("Your lucky days are : Monday,Thursday");
                    System.out.println("Your ruling planet is : Moon");
                    System.out.println("Famous personalities born in this month are : Sundar Pichai,P.V.Sindhu");
                }
                else if(date>=22&&date<=31)
                {
                    System.out.println("Your Zodiac Sign is : Leo");
                    System.out.println("Your Birth stone is : Peridot");
                    System.out.println("Your Positive characters are : Loyal,Straightforward,Kind and big hearted");
                    System.out.println("Your Negative characters are : Egoistic,Dominating,Arrogant");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colours are : Gold,Yellow,Orange");
                    System.out.println("Your lucky numbers are : 1,3,10,19");
                    System.out.println("Your lucky day is : Sunday");
                    System.out.println("Your ruling planet is : Sun");
                    System.out.println("Famous personalities born in this month are : Sundar Pichai,P.V.Sindhu");
                    }
                }
                else if(mm==8)
                {
                    if(date>=1&&date<=21)
                    {
                        System.out.println("Your Zodiac Sign is : Leo");
                    System.out.println("Your Birth stone is : Peridot");
                    System.out.println("Your Positive characters are : Loyal,Straightforward,Kind and big hearted");
                    System.out.println("Your Negative characters are : Egoistic,Dominating,Arrogant");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colours are : Gold,Yellow,Orange");
                    System.out.println("Your lucky numbers are : 1,3,10,19");
                    System.out.println("Your lucky day is : Sunday");
                    System.out.println("Your ruling planet is : Sun");
                    System.out.println("Famous personalities born in this month are : Sridevi,Saif Ali Khan");
                }
else if(date>=22&&date<=31)
                {
                    System.out.println("Your Zodiac Sign is : Virgo");
                    System.out.println("Your Birth stone is : Sapphire");
                    System.out.println("Your Positive characters are : Practical,Intelligent,Analytical");
                    System.out.println("Your Negative characters are : Harsh,Conservative,Overcritical");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Grey,Beig,Pale yellow");
                    System.out.println("Your lucky numbers are : 5,14,15,23,32");
                    System.out.println("Your lucky day is : Wednesday");
                    System.out.println("Your ruling planet is : Mercury");
                    System.out.println("Famous personalities born in this month are : Sridevi,Saif Ali Khan");
                }
            }
            else if(mm==9)
            {
                if(date>=1&&date<=21)
                {
                  System.out.println("Your Zodiac Sign is : Virgo");
                    System.out.println("Your Birth stone is : Sapphire");
                    System.out.println("Your Positive characters are : Practical,Intelligent,Analytical");
                    System.out.println("Your Negative characters are : Harsh,Conservative,Overcritical");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Grey,Beig,Pale yellow");
                    System.out.println("Your lucky numbers are : 5,14,15,23,32");
                    System.out.println("Your lucky day is : Wednesday");
                    System.out.println("Your ruling planet is : Mercury");
                    System.out.println("Famous personalities born in this month are : Bhagat Singh,Lata Mangeshkar"); 
                }
                else if(date>=22&&date<=30)
                {
                    System.out.println("Your Zodiac Sign is : Libra");
                    System.out.println("Your Birth stone is : Pink Tourmaline");
                    System.out.println("Your Positive characters are : Charming,Diplomatic,Balanced");
                    System.out.println("Your Negative characters are : Superficial,Unreliable,Self indulgent");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Pink,Green");
                    System.out.println("Your lucky numbers are : 4,6,13,15,24");
                    System.out.println("Your lucky day is : Friday");
                    System.out.println("Your ruling planet is : Venus");
                    System.out.println("Famous personalities born in this month are : Bhagat Singh,Lata Mangeshkar"); 
                }
            }
            else if(mm==10)
            {
                if(date>=1&&date<=22)
                {
                   System.out.println("Your Zodiac Sign is : Libra");
                    System.out.println("Your Birth stone is : Pink Tourmaline");
                    System.out.println("Your Positive characters are : Charming,Diplomatic,Balanced");
                    System.out.println("Your Negative characters are : Superficial,Unreliable,Self indulgent");
                    System.out.println("Your element is : Air");
                    System.out.println("Your lucky colours are : Pink,Green");
                    System.out.println("Your lucky numbers are : 4,6,13,15,24");
                    System.out.println("Your lucky day is : Friday");
                    System.out.println("Your ruling planet is : Venus");
                    System.out.println("Famous personalities born in this month are : Mohandas Kramchand Gandhi,Hema Malini");
                }
                else if(date>=23&&date<=31)
                {
                    System.out.println("Your Zodiac Sign is : Scorpio");
                    System.out.println("Your Birth stone is : Topaz");
                    System.out.println("Your Positive characters are : Focused,Brave,Faithful");
                    System.out.println("Your Negative characters are : Jealous,Secretive,Manipulative");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Scarlet,Red,Rust");
                    System.out.println("Your lucky numbers are : 8,11,18,22");
                    System.out.println("Your lucky day is : Tuesday");
                    System.out.println("Your ruling planets are : Pluto,Mars");
                    System.out.println("Famous personalities born in this month are : Mohandas Kramchand Gandhi,Hema Malini");
                    }
                }
                else if(mm==11)
                {
                    if(date>=1&&date<=20)
                    {
                     System.out.println("Your Zodiac Sign is : Scorpio");
                    System.out.println("Your Birth stone is : Topaz");
                    System.out.println("Your Positive characters are : Focused,Brave,Faithful");
                    System.out.println("Your Negative characters are : Jealous,Secretive,Manipulative");
                    System.out.println("Your element is : Water");
                    System.out.println("Your lucky colours are : Scarlet,Red,Rust");
                    System.out.println("Your lucky numbers are : 8,11,18,22");
                    System.out.println("Your lucky day is : Tuesday");
                    System.out.println("Your ruling planets are : Pluto,Mars");
                    System.out.println("Famous personalities born in this month are : Jawaharlal Nehru,Indira Gandhi");
                }
                else if(date>=21&&date<=30)
                {
                     System.out.println("Your Zodiac Sign is : Sagittarius");
                    System.out.println("Your Birth stone is : Blue topaz");
                    System.out.println("Your Positive characters are : Philosophical,Large hearted,Adventerous");
                    System.out.println("Your Negative characters are : Careless,Superficial,Impatient");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colour is : Blue");
                    System.out.println("Your lucky numbers are : 3,7,9,12,21");
                    System.out.println("Your lucky day is : Thursday");
                    System.out.println("Your ruling planet is : Jupiter");
                    System.out.println("Famous personalities born in this month are : Jawaharlal Nehru,Indira Gandhi");
                    }
                }
                else if(mm==12)
                {
                    if(date>=1&&date<=20)
                    {
                       System.out.println("Your Zodiac Sign is : Sagittarius");
                    System.out.println("Your Birth stone is : Blue topaz");
                    System.out.println("Your Positive characters are : Philosophical,Large hearted,Adventerous");
                    System.out.println("Your Negative characters are : Careless,Superficial,Impatient");
                    System.out.println("Your element is : Fire");
                    System.out.println("Your lucky colour is : Blue");
                    System.out.println("Your lucky numbers are : 3,7,9,12,21");
                    System.out.println("Your lucky day is : Thursday");
                    System.out.println("Your ruling planet is : Jupiter");
                    System.out.println("Famous personalities born in this month are : Atal Bihari Vajpayee,Sonia Gandhi"); 
                    }
                else if(date>=21&&date<=31)
                {
                   System.out.println("Your Zodiac Sign is : Capricorn");
                    System.out.println("Your Birth stone is : Garnet");
                    System.out.println("Your Positive characters are : Practical,Ambitious,Disciplined");
                    System.out.println("Your Negative characters are : Stubborn,Shy,Self-centered");
                    System.out.println("Your element is : Earth");
                    System.out.println("Your lucky colours are : Brown,Black");
                    System.out.println("Your lucky numbers are : 4,8,13,22");
                    System.out.println("Your lucky day is : Saturday");
                    System.out.println("Your ruling planet is : Saturn");
                    System.out.println("Famous personalities born in this month are : Atal Bihari Vajpayee,Sonia Gandhi"); 
                }
            }
        
    
             else if(mm<1&&mm>12)
             {
            
            }
        }
        else 
         System.out.println("The month entered by you is incorrect.Please enter the correct month");
    
        } else
            
           System.out.println("The year entered by you is incorrect.Please enter the correct year");
        
       }
       System.out.println("The date entered by you is incorrect .Please enter the correct date");
        
        
    
    
     System.out.println("Enter 1 to continue or any other number to exit");
     t=in.nextInt();
    }while(t==1);
    
     if(t!=1)
     System.out.println("Thank You.Visit again!!!");

}
}




