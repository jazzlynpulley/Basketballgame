import java.util.Random ;
class Basketball {
	
	int chance ;
	int distance ;
	int score ;
	Random rand = new Random() ;
	
	public Basketball(){
		this.chance = 0 ;
		this.distance = 0 ;
		this.score = 0 ;
	}
	
	public Basketball(int chance, int distance, int score){
		this.chance = chance ;
		this.distance = distance ;
		this.score = score ;
	}
	
	public int getDistance(){
		distance = rand.nextInt(23) + 2 ;
		return distance ;
	}
	
	public int getScore(){
		if (distance <= 5 && distance >=2){
			chance = rand.nextInt(100) ;
			if (chance >= 75){
				score = score + 2 ;
				System.out.println("Score! + 2");
				{
				}
			}
		}
		else if (distance >= 6 && distance <= 18){
			chance = rand.nextInt(100) ;
			if (chance >= 50){
				score = score + 2 ;
				System.out.println("Score! + 2");
			}
		}
		else if (distance >= 19 && distance <=25){
			chance = rand.nextInt(100) ;
			if (chance >= 17){
				score = score + 3 ;
				System.out.println("Score! + 3");
			}
		}
		return score ;
	}

}
