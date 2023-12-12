# SimulationGame
A step-by-step simulation of a 2D world populated by herbivores and predators. In addition to creatures, the world contains resources (grass) that herbivores feed on, and static objects that cannot be interacted with - they just take up space.
#
The application is written in Java in the OOP style. The BFS algorithm is used in the path search.
Technical specification of the project: https://zhukovsd.github.io/java-backend-learning-course/Projects/Simulation/
## Game Rules
- wolves are looking for rabbits, getting closer to them – they attack;
- rabbits have health reserves, wolves have damage power;
- rabbits are looking for grass, getting closer to it – they instantly eat
- grass adds a small amount of health to the rabbit;
- The animals have a speed (how many cells they can pass in 1 iteration)
- the game ends after the death of all the rabbits or through the exit symbol from the simulation.

# 🟫🍀🐇🗻🐺🌲
## Game Preview
![](/img/img.png)
![](/img/img_1.png)
