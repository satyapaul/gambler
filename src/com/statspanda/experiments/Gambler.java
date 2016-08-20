package com.statspanda.experiments;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Random;

/**
 * If you have two dices and would like to understand how the numbers are stacked up when
 * you roll out them and sum up the two numbers that appear on the upper faces, then this 
 * program is for you.
 * 
 * Some basics - each dice has six faces numbered 1 through 6. When you roll out the dices,
 * then sum of the two numbers can be one of these 11 numbers - 2, 3, 4, 5, 6, 7, 8, 9, 10, 
 * 11, 12. That's it. What are the odds for each of the numbers coming up as a result of sum? 
 * Are the odds equal for the each of these of numbers? Answer is NO. It really depends on  
 * how many different ways you can get a number. For example, 2 can come up only in one way  
 * i.e. (1 + 1) but 5 can come in multiple ways (1 + 4 ), (2 + 3) etc.
 * 
 * This program simulates rolling of two dices by generating two random numbers in the range 
 * of 1 - 6. Then is sums them up to come up with the winning number. It repeats the steps as
 * many times of as value mentioned in noOfRounds.
 * 
 * This program will help you to
 * 
 * 0. Roll two dices and get the wining number 
 * 
 * The result will be a number between 2 to 12
 * 
 * 1. Generate frequency distribution 
 * 
 * It generates the sum of two numbers after rolling of two dices for number of rounds.
 * 
 Input Parameter:
 
 int noOfRounds = 10,000,000;
 
 Result:
 
 Number of times & % of total opportunities grabbed by each of the numbers.

| Position  | Frequency | Feq in % | 
------------------------------------------
| Number 12 | 277,771 | 2.78% | 
------------------------------------------
| Number 2 | 277,148 | 2.77% | 
------------------------------------------
| Number 4 | 831,981 | 8.32% | 
------------------------------------------
| Number 3 | 555,619 | 5.56% | 
------------------------------------------
| Number 6 | 1,389,822 | 13.9% | 
------------------------------------------
| Number 5 | 1,110,738 | 11.11% | 
------------------------------------------
| Number 8 | 1,389,151 | 13.89% | 
------------------------------------------
| Number 7 | 1,666,267 | 16.66% | 
------------------------------------------
| Number 9 | 1,112,411 | 11.12% | 
------------------------------------------
| Number 11 | 555,447 | 5.55% | 
------------------------------------------
| Number 10 | 833,645 | 8.34% | 
------------------------------------------
| Total Sum | 10,000,000 | 100% | 
------------------------------------------

 * 
 * 
 * 2. Table owner takes a cut and rest of the money distributed among the players based on their bets. (vanilla) 
 * 
 Input Parameters:
		int amount = 10;
		double tableOwnersCharge = 0.20; 
		int noOfRounds = 2000000;
		int noOfPlayers = 11;
		
 Result:		
---------------------------------------------
| Player 10 | 14,669,600 | 7% | 
---------------------------------------------
| Player 11 | 9,750,488 | 4% | 
---------------------------------------------
| Player 8 | 24,552,264 | 11% | +ve
---------------------------------------------
| Player 7 | 29,277,952 | 13% | +ve
---------------------------------------------
| Player 9 | 19,553,160 | 9% | 
---------------------------------------------
| Player 4 | 14,633,696 | 7% | 
---------------------------------------------
| Player 3 | 9,773,192 | 4% | 
---------------------------------------------
| Player 6 | 24,457,400 | 11% | +ve
---------------------------------------------
| Player 5 | 19,573,752 | 9% | 
---------------------------------------------
| Player 2 | 4,876,344 | 2% | 
---------------------------------------------
| Player 12 | 4,882,152 | 2% | 
---------------------------------------------
| Table Owner | 44,000,000 | 20% | 
---------------------------------------------
| Spend Per Player | 20,000,000 | 9% | 
---------------------------------------------
| Total Amount Betted | 220,000,000 | 100% | 
---------------------------------------------
 * 
 * 
 * 3. No pre-defined cut for Table owner. Multiple players participate. Number of players determined randomly, 
 * it will be a number between 1 and 11. Amount betted is ranged between $10 to $1000. Actual amount betted is 
 * determined randomly. (banana)
 * 
 Input Parameters:
 		int __noOfRounds =1,000,000;
		int __minBettingAmount = 10;
		int __maxBettingAmount = 1000;
		int minNoOfPlayers = 1;
		int maxNoOfPlayers = 11;

Result:

========= TOTAL AMOUNT BETTED BY EACH PLAYER POSITION =========
------------------------------------
Player Position 4 | $276,025,231
------------------------------------
Player Position 5 | $275,850,639
------------------------------------
Player Position 6 | $275,374,362
------------------------------------
Player Position 7 | $275,526,040
------------------------------------
Player Position 2 | $275,613,052
------------------------------------
Player Position 3 | $274,947,829
------------------------------------
Player Position 10 | $275,777,883
------------------------------------
Player Position 11 | $275,233,244
------------------------------------
Player Position 12 | $275,308,337
------------------------------------
Player Position 8 | $275,197,852
------------------------------------
Player Position 9 | $274,973,749
------------------------------------
Total Betted Amount | $3,029,828,218
------------------------------------

======== TOTAL AMOUNT WON BY EACH PLAYER POSITION =========
-----------------------------------------------
| Player Position 4 | $175,887,913 | 5.81% | 
-----------------------------------------------
| Player Position 5 | $234,566,644 | 7.74% | 
-----------------------------------------------
| Player Position 6 | $292,437,606 | 9.65% | +ve
----------------------------------------------- 
| Player Position 7 | $350,616,777 | 11.57% | +ve
-----------------------------------------------
| Player Position 2 | $57,980,399 | 1.91% |
-----------------------------------------------
| Player Position 3 | $118,038,318 | 3.90% |
-----------------------------------------------
| Player Position 10 | $176,005,502 | 5.81% |
-----------------------------------------------
| Player Position 11 | $117,401,400 | 3.87% |
-----------------------------------------------
| Player Position 12 | $58,484,553 | 1.93% |
-----------------------------------------------
| Player Position 8 | $294,861,804 | 9.73% |
-----------------------------------------------
| Player Position 9 | $233,939,146 | 7.72% | +ve
-----------------------------------------------
| Table Owner | $919,608,156 | 30.35%
-----------------------------------------------
| Total Amount Betted | $3,029,828,218 | 100.00%
-----------------------------------------------


 * 
 * 4. A Fair Game Payoff Matrix. By now, you know rolling of two dices is not a fair game i.e.
 * probability of certain number appearing is higher.    
 * 
Input Parameters:
		int noOfRounds = 500000;
		double tableOwnersCharge = 0.20;

Results:
Shows how much will be your return for every $ you bet on each of the positions. Here are the table owner takes a cut of 20%.

Table Owner Charges 20%
----------------------
| Number 10 | $10 |
----------------------
| Number 11 | $15 |
----------------------
| Number 8 | $6 |
----------------------
| Number 7 | $5 |
----------------------
| Number 9 | $7 |
----------------------
| Number 4 | $10 |
----------------------
| Number 3 | $14 |
----------------------
| Number 6 | $6 |
----------------------
| Number 5 | $7 |
----------------------
| Number 12 | $29 |
----------------------
| Number 2 | $29 |
----------------------

Table Owner doesn't charge anything
----------------------
| Number 12 | $36 |
----------------------
| Number 2 | $36 |
----------------------
| Number 4 | $12 |
----------------------
| Number 3 | $18 |
----------------------
| Number 6 | $7 |
----------------------
| Number 5 | $9 |
----------------------
| Number 8 | $7 |
----------------------
| Number 7 | $6 |
----------------------
| Number 9 | $9 |
----------------------
| Number 11 | $18 |
----------------------
| Number 10 | $12 |
----------------------
 * 
 * 
 * 5. A pre-defined cut for Table owner. A player keeps on betting on one number. A winning bet will fetch a 
 * return based on pre-determined rate which decided based on Fair Game Matrix. It shows choice of number really
 * doesn't make any difference. (strawberry)
 * 
Input Parameters:
		int _amount = 10;
		int _noOfRounds = 3000000;
		int _bettedNo = 7; // 8, 3, 12
		double tableOwnersCharge = 0.30; 
Result:

#1
 -----------------------------------------------
| Table Owner | 9,526,117 | 31.75%
-----------------------------------------------
| Player 7 | 20,473,883 | 68.25%
-----------------------------------------------
| Total Amount Betted | 30,000,000 | 100.00%
-----------------------------------------------

#2
-----------------------------------------------
| Table Owner | 9,218,150 | 30.73%
-----------------------------------------------
| Player 8 | 20,781,850 | 69.27%
-----------------------------------------------
| Total Amount Betted | 30,000,000 | 100.00%
-----------------------------------------------

#3
-----------------------------------------------
| Table Owner | 9,019,975 | 30.07%
-----------------------------------------------
| Player 12 | 20,980,025 | 69.93%
-----------------------------------------------
| Total Amount Betted | 30,000,000 | 100.00%
-----------------------------------------------


 * 
 * @author satyajitpaul
 *
 */
public class Gambler {

	public static void main(String[] args) {
		

		generateFrequencyDistribution();

		// vanilla
		//playAMultiPlayerGameOfGamble();

		// Banana
		//playAMultiplayerRealGameOfGamble();		

		//fair game return
		//generateAFairGameReturnMatrix();

		// strawberry
		//playFairGameOfGamble();
		

	}
	
	public static void generateFrequencyDistribution() {
		int noOfRounds = 10000000;
		HashMap<String, Long> randomNumFreqMap = generateFrequencyDistribution(noOfRounds);
		DecimalFormat df = new DecimalFormat("#.##");
		long totalSum = 0;
		System.out.println("------------------------------------------");
		for(String winnerName : randomNumFreqMap.keySet()) {
			long value = randomNumFreqMap.get(winnerName);
			totalSum = totalSum + value;
			//System.out.println("| "+ winnerName + " | " + value +" |" );
			System.out.println("| "+ winnerName + " | " + String.format("%,d", value) +" | " + df.format( ((double)value/noOfRounds) * 100) +"% | " );
			
			System.out.println("------------------------------------------");
		}
		
		System.out.println("| Total Sum | " + String.format("%,d", totalSum) +" | " + df.format( ((double)totalSum/noOfRounds) * 100) +"% | " );
	}
	
	public static void playAMultiPlayerGameOfGamble() {
		// vanilla
		int amount = 10;
		double tableOwnersCharge = 0.20; 
		int noOfRounds = 2000000;
		int noOfPlayers = 11;
		
		HashMap<String, Integer> winnersShare = playRollingDiceVanilla(amount, tableOwnersCharge, noOfRounds, noOfPlayers);
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("---------------------------------------------");
		for(String winnerName : winnersShare.keySet()) {
			int value = winnersShare.get(winnerName);
			System.out.println("| "+ winnerName + " | " + String.format("%,d", value) +" | " + df.format( ((double)value/(noOfRounds*10*11)) * 100) +"% | " );
			System.out.println("---------------------------------------------");
		}
	}
	
	public static void playFairGameOfGamble() {
		// Strawberry
		int _amount = 10;
		int _noOfRounds = 3000000;
		int _bettedNo = 12;
		double tableOwnersCharge = 0.30; 
		HashMap<String, Integer> _winnersShare = playRollingDiceStrawberry(_amount, _noOfRounds, _bettedNo, tableOwnersCharge);
		
		int totalAmountBetted = _winnersShare.get("Total Amount Betted");
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("-----------------------------------------------");
		for(String winnerName : _winnersShare.keySet()) {
			int value = _winnersShare.get(winnerName);
			System.out.println("| "+ winnerName + " | " + String.format("%,d", value) +" | " + df.format(((double)value/totalAmountBetted)*100) + "%");
			System.out.println("-----------------------------------------------");
		}

	}
	
	
	public static void playAMultiplayerRealGameOfGamble() {
		// Banana
		int __noOfRounds =1000000;
		int __minBettingAmount = 10;
		int __maxBettingAmount = 1000;
		int minNoOfPlayers = 1;
		int maxNoOfPlayers = 11;
		HashMap<String, Long> __winnersShare = playRollingDiceBanana(__noOfRounds, __minBettingAmount, __maxBettingAmount, minNoOfPlayers, maxNoOfPlayers);
		long totalAmountBetted = __winnersShare.get("Total Amount Betted");
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("-----------------------------------------------");
		for(String winnerName : __winnersShare.keySet()) {
			long value = __winnersShare.get(winnerName);
			System.out.println("| "+ winnerName + " | $" + String.format("%,d", value) +" | " + df.format(((double)value/totalAmountBetted)*100) + "%" );
			System.out.println("-----------------------------------------------");
		}	
	}
	
	public static void generateAFairGameReturnMatrix() {
		int noOfRounds = 500000;
		double tableOwnersCharge = 0.20;
		DecimalFormat df = new DecimalFormat("#");
		HashMap<String, Double> fairGameMatrix = getFairGamePayoffMatrix( noOfRounds,  tableOwnersCharge);

		System.out.println("----------------------");
		for( String player : fairGameMatrix.keySet()) {
			double returnVal = fairGameMatrix.get(player);
			System.out.println("| "+ player + " | $" + df.format(returnVal) +" |" );
			System.out.println("----------------------");
			
		}
	}

	/**
	 * 
	 * @return
	 */
	public static int rollTwoDicesAndGetWinningNo() {
		int dice1No = getRandomNumber(1, 6);
		int dice2No = getRandomNumber(1, 6);
		int sum = dice1No + dice2No;
		return sum;
	}
	
	/**
	 * 
	 * @param noOfRounds
	 * @return
	 */
	public static HashMap<String, Long> generateFrequencyDistribution(int noOfRounds) {
		HashMap<String, Long> randomNumFreqMap = new HashMap<String, Long>();
		int dice1No = 0;
		int dice2No = 0;
		for(int i= 0 ; i < noOfRounds ; i++) {
			dice1No = getRandomNumber(1, 6);
			dice2No = getRandomNumber(1, 6);
			int sum = dice1No + dice2No;
			Long frequency = randomNumFreqMap.get("Number "+sum);
			if ( frequency != null) {
				randomNumFreqMap.put("Number "+sum, new Long(frequency.intValue()+1));
			} else {
				randomNumFreqMap.put("Number "+sum, new Long(1));
			}
			//System.out.println(i+" >> "+getRandomNumber(2, 12) + "  vs " + sum );
		}
		return randomNumFreqMap;
	}
	
	
	/**
	 * 
	 * @param noOfRounds
	 * @param tableOwnersCharge
	 * @return
	 */
	public static HashMap<String, Double> getFairGamePayoffMatrix(int noOfRounds, double tableOwnersCharge) {
		HashMap<String, Double> payoffMatrix = new HashMap<String, Double>();
		HashMap<String, Long> randomNumFreqMap = generateFrequencyDistribution( noOfRounds);
		DecimalFormat df = new DecimalFormat("#.00");
		for( String player : randomNumFreqMap.keySet()) {
			double value = randomNumFreqMap.get(player);
			double payOff = (noOfRounds*(1-tableOwnersCharge))/value;
			payoffMatrix.put(player, new Double(payOff));
		}
		return payoffMatrix;
	}
	
	
	
	/**
	 * vanilla: full table, equal amount for all players, max upto 11 players, winner takes 80%
	 * @param amount
	 * @param tableOwnersCharge
	 * @param noOfRounds
	 * @param noOfPlayers
	 * @return
	 */
	public static HashMap<String, Integer> playRollingDiceVanilla(int amount, double tableOwnersCharge, int noOfRounds, int noOfPlayers) {
		HashMap<String, Integer> winnersMatrix = new HashMap<String, Integer>();
		int dice1No = 0;
		int dice2No = 0;
		winnersMatrix.put("Total Amount Betted", new Integer( amount*noOfPlayers*noOfRounds ));
		winnersMatrix.put("Spend Per Player", new Integer( amount*noOfRounds ));
		for(int i= 0 ; i < noOfRounds ; i++) {
			dice1No = getRandomNumber(1, 6);
			dice2No = getRandomNumber(1, 6);
			int sum = dice1No + dice2No;
			Integer amountWon = winnersMatrix.get("Player "+sum);
			if ( amountWon != null) {
				winnersMatrix.put("Player "+sum, new Integer(amountWon.intValue() + (int)(amount*noOfPlayers*(1 - tableOwnersCharge) ) ));
			} else {
				winnersMatrix.put("Player "+sum, new Integer( (int)(amount*noOfPlayers* ( 1- tableOwnersCharge) )  ));
			}
			Integer ownersBounty = winnersMatrix.get("Table Owner");
			if ( ownersBounty != null) {
				winnersMatrix.put("Table Owner", new Integer(ownersBounty.intValue() + (int)(amount*noOfPlayers*tableOwnersCharge) ));
			} else {
				winnersMatrix.put("Table Owner", new Integer( (int)(amount*noOfPlayers*tableOwnersCharge)  ));
			}
		}
		return winnersMatrix;
	}

	
	private static int getRandomNumber(int min, int max) {
		Random rand = new Random();
		int random = rand.nextInt((max - min) + 1) + min;
		return random;
	}

	
	
	/**
	 * strawberry: single player, unlimited amount, winner gets return at pre-determined rate based 
	 * on Fair Game Payoff Matrix and Table Owner takes a cut.
	 * @param amountBetted
	 * @param noOfRounds
	 * @param bettedNo
	 * @param tableOwnersCharge
	 * @return
	 */
	public static HashMap<String, Integer> playRollingDiceStrawberry(int amountBetted, int noOfRounds, int bettedNo, double tableOwnersCharge) {
		
		HashMap<String, Double> fairGameMatrix = getFairGamePayoffMatrix( noOfRounds,  tableOwnersCharge);
		double rateOfReturn = fairGameMatrix.get("Number "+bettedNo);
		int _amount = (int)(amountBetted*rateOfReturn);
		
		HashMap<String, Integer> winnersMatrix = new HashMap<String, Integer>();
		winnersMatrix.put("Player "+bettedNo, 0);
		winnersMatrix.put("Table Owner", 0);

		int dice1No = 0;
		int dice2No = 0;

		String winner = "Table Owner";

		winnersMatrix.put("Total Amount Betted", new Integer( amountBetted*noOfRounds ));
		
		for(int i= 0 ; i < noOfRounds ; i++) {
			dice1No = getRandomNumber(1, 6);
			dice2No = getRandomNumber(1, 6);
			int sum = dice1No + dice2No;
			
			Integer amountWonSoFarByPlayer = winnersMatrix.get("Player "+bettedNo);
			Integer amountWonSoFarByTableOwner = winnersMatrix.get("Table Owner");
			
			if ( sum == bettedNo) {
				winner = "Player "+bettedNo;
				if ( amountWonSoFarByPlayer != null) {
					amountWonSoFarByPlayer = amountWonSoFarByPlayer + _amount;
				} else {
					amountWonSoFarByPlayer = _amount;
				}
				amountWonSoFarByTableOwner = amountWonSoFarByTableOwner - (_amount-amountBetted);
			} else {
				winner = "Table Owner";
				if(amountWonSoFarByTableOwner != null) {
					amountWonSoFarByTableOwner = amountWonSoFarByTableOwner + amountBetted;
				} else {
					amountWonSoFarByTableOwner = amountBetted;
				}
			}
			winnersMatrix.put("Player "+bettedNo, amountWonSoFarByPlayer);
			winnersMatrix.put("Table Owner", amountWonSoFarByTableOwner);
		}
		return winnersMatrix;
	}
	
	

	/**
	 * Banana: need not be full table, winner(s) take all. Table owner doesn't have any planned cut.  
	 * For every round generate random matrix of amount betted by playing positions. Available playing 
	 * positions are 2 to 12. Number of players for a round is randomly generated.
	 * Calculate total amount betted in the round
	 * Roll the dices
	 * Check if anyone betted on the winning position
	 * @param noOfRounds
	 * @param minBettingAmount
	 * @param maxBettingAmount
	 * @param minNoOfPlayers
	 * @param maxNoOfPlayers
	 * @return
	 */
	public static HashMap<String, Long> playRollingDiceBanana(int noOfRounds, int minBettingAmount, int maxBettingAmount, int minNoOfPlayers, int maxNoOfPlayers ) {
		
		int noOfPlayers = 1; 
		long totalAmountBettedInTheRound = 0 ; 
		long totalAmountBetted = 0 ; 
		
		HashMap<String, Integer> totalBettingAmountByPlayerPosition = new HashMap<String, Integer>();
		HashMap<String, Integer> bettingAmountByPlayerPosition = null;
		HashMap<String, Long> winnersMatrix = new HashMap<String, Long>();
		
		int dice1No = 0;
		int dice2No = 0;
		long totBettingAmnt = 0 ;
		
		for(int i= 0 ; i < noOfRounds ; i++) {
			noOfPlayers = getRandomNumber(minNoOfPlayers, maxNoOfPlayers);
			bettingAmountByPlayerPosition = getBettingAmountByPosition(noOfPlayers, minBettingAmount, maxBettingAmount);
			//System.out.println("Round :: " + i);
			// find total amount betted in the round/game
			totalAmountBettedInTheRound = 0 ;
			for(String playerName : bettingAmountByPlayerPosition.keySet()) {
				//System.out.println(playerName+ " = " + bettingAmountByPlayerPosition.get(playerName));
				totalAmountBettedInTheRound = totalAmountBettedInTheRound + bettingAmountByPlayerPosition.get(playerName);
				int totalValueBettedAtPosition = totalBettingAmountByPlayerPosition.get(playerName) == null ? 0 : totalBettingAmountByPlayerPosition.get(playerName);
				totalBettingAmountByPlayerPosition.put(playerName, totalValueBettedAtPosition + bettingAmountByPlayerPosition.get(playerName));
			}
			// find total amount betted so far 
			totalAmountBetted = totalAmountBetted + totalAmountBettedInTheRound;
			// roll the dices
			dice1No = getRandomNumber(1, 6);
			dice2No = getRandomNumber(1, 6);
			// WINNING POSITION
			int sum = dice1No + dice2No;
			// Check if anyone betted on the winning position
			Integer bettedAmountInWinningPosition = bettingAmountByPlayerPosition.get("Player Position "+sum);
			if ( bettedAmountInWinningPosition != null) {
				// goes to winning position
				Long amountWonSoFar = winnersMatrix.get("Player Position "+sum);
				if ( amountWonSoFar != null) {
					winnersMatrix.put("Player Position "+sum, new Long(amountWonSoFar.longValue() + totalAmountBettedInTheRound ));
				} else {
					winnersMatrix.put("Player Position "+sum, totalAmountBettedInTheRound  );
				}
			} else {
				// goes to table owner
				Long ownersBounty = winnersMatrix.get("Table Owner");
				if ( ownersBounty != null) {
					winnersMatrix.put("Table Owner", new Long(ownersBounty.longValue() + totalAmountBettedInTheRound) );
				} else {
					winnersMatrix.put("Table Owner", new Long(totalAmountBettedInTheRound) );
				}
			}
		}
		
		System.out.println("================= TOTAL AMOUNT BETTED BY EACH NUMBER ===================");
		for(String playerName : totalBettingAmountByPlayerPosition.keySet()) {
			totBettingAmnt = totBettingAmnt + totalBettingAmountByPlayerPosition.get(playerName);
			System.out.println(playerName+ " | $" + String.format("%,d", totalBettingAmountByPlayerPosition.get(playerName)));
			System.out.println("------------------------------------");
		}
		System.out.println("Total Betted Amount " + String.format("%,d", totBettingAmnt));
		winnersMatrix.put("Total Amount Betted", new Long( totalAmountBetted ));
		return winnersMatrix;
		
	}
	
	private static HashMap<String, Integer> getBettingAmountByPosition(int noOfPlayers, int minAmount, int maxAmount) {
		HashMap<String, Integer> bettingAmountByPlayerPosition = new HashMap<String, Integer>();
		for ( int i = 0 ; i < noOfPlayers ; i++) {
			String playerPosition = "Player Position " + getRandomNumber(2, 12);
			Integer amountByPositionSoFar = bettingAmountByPlayerPosition.get(playerPosition);
			while(amountByPositionSoFar != null) {
				playerPosition = "Player Position " + getRandomNumber(2, 12);
				amountByPositionSoFar = bettingAmountByPlayerPosition.get(playerPosition);
			}
			bettingAmountByPlayerPosition.put(playerPosition, getRandomNumber(minAmount, maxAmount));
		}
		return bettingAmountByPlayerPosition;
	}

}
