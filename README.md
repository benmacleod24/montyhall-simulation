<div style="display:flex;justify-content:center">
		<h2 style='font-size: 25px;font-weight:bold;'>Monty Hall Simulation</h2>
		<image style='margin:0 7px;' src='https://img.shields.io/github/v/release/benmacleod24/montyhall-simulation?label=version&style=plastic'/>
		<img alt="GitHub top language" src="https://img.shields.io/github/languages/top/benmacleod24/montyhall-simulation?style=plastic&color=F59E0B">
</div>

### What is the Monty Hall Problem? 
> Monty Hall asks you to choose one of three doors. One of the doors hides a prize and the other two doors have no prize. You state out loud which door you pick, but you don’t open it right away. Monty opens one of the other two doors, and there is no prize behind it. One is opened and does not have the prize. At this moment, there are two closed doors, one of which you picked. The prize is behind one of the closed doors, but you don’t know which one. Monty asks you, “Do you want to switch doors?” The majority of people assume that both doors are equally likely to have the prize. It appears like the door you chose has a 50/50 chance. Because there is no perceived reason to change, most stick with their initial choice. Time to shatter this illusion with the truth! If you switch doors, you double your probability of winning! [Article](https://statisticsbyjim.com/fun/monty-hall-problem/)

### Project Brief
Building this program was one of my "curious" projects. I heard about the Monty Hall problem from my computer science professor, I said to myself "no way that can be true". I want to test this theory for myself, but I didn't really want to do it by hand so what did I do? Built a Java simulation, I was able to enter any number of simulations and weather it should keep the door or switch the door. Once the simulation ran it displayed the total num of wins, win ratio and percentage.

### Simulation Data

|Number of Simulation| Switched Door | Number of Wins | Ratio | Percentage
|--|--|--|--|--|
| 10 | `TRUE` | 8 | 4/5 | 80% |
| 10 | `FALSE` | 2 | 1/5 | 20% |
| 50 | `TRUE` | 33 | 33/50 | 66% |
| 50 | `FALSE` | 19 | 19/50 | 38% |
| 100 | `TRUE` | 57 | 57/100 | 57% |
| 100 | `FALSE` | 36 | 9/25 | 36% |
| 1000 | `TRUE` | 692 | 173/250 | 69% |
| 1000 | `FALSE` | 303 | 303/1000 | 30% |

### Technology
I decided to use `Java` because it's fast and universal so I didn't have to worry about other operating systems. I also experimented with it in C++ but decided not to use it because it simpler to do in java.
