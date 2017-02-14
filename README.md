# Particle-Swarm-Optimization
A population based stochastic algorithm for finding the minimum value in a function.

## Sample Output: Ackley's Function

![alt-tag](https://www.sfu.ca/~ssurjano/ackley.png)

```
Mac:ParticleSwarmOptimization Laki$ java PSO.Main
Use the parameter '-p' to change the inertia, cognitive and social components.
Otherwise the default values will be: 
Inertia:             0.729844
Cognitive Component: 1.49618
Social Component:    1.49618
----------------------------MENU----------------------------
Select a function:
1. (x^4)-2(x^3)
2. Ackley's Function
3. Booth's Function
4. Three Hump Camel Function
Function:  2
Particles: 1000
Epochs:    1000
--------------------------EXECUTING-------------------------
Global Best Evaluation (Epoch 0):	5.422131717799509
Global Best Evaluation (Epoch 3):	0.031656530136856986
Global Best Evaluation (Epoch 8):	0.030219907753814113
Global Best Evaluation (Epoch 10):	0.02538826049692844
Global Best Evaluation (Epoch 11):	0.025236966868810384
Global Best Evaluation (Epoch 17):	0.02166967644671658
Global Best Evaluation (Epoch 18):	0.017187649614228917
Global Best Evaluation (Epoch 19):	0.016496497260948928
Global Best Evaluation (Epoch 22):	0.0021499892932403952
Global Best Evaluation (Epoch 34):	0.0019956299229910712
Global Best Evaluation (Epoch 43):	0.0015960080106260932
Global Best Evaluation (Epoch 44):	0.0014693467707225238
Global Best Evaluation (Epoch 46):	2.986043254615822E-4
Global Best Evaluation (Epoch 49):	6.164677056474943E-5
Global Best Evaluation (Epoch 66):	1.1299483393401033E-5
Global Best Evaluation (Epoch 78):	4.5291077945819325E-6
Global Best Evaluation (Epoch 89):	3.4391925716192873E-6
Global Best Evaluation (Epoch 91):	2.141784676723546E-6
Global Best Evaluation (Epoch 94):	2.0698024343346333E-6
Global Best Evaluation (Epoch 95):	1.8336575031696611E-6
Global Best Evaluation (Epoch 98):	1.1274069358080396E-6
Global Best Evaluation (Epoch 100):	8.45729953624641E-7
Global Best Evaluation (Epoch 110):	7.325002755464993E-7
Global Best Evaluation (Epoch 112):	5.200744297439996E-7
Global Best Evaluation (Epoch 115):	7.409581215256367E-8
Global Best Evaluation (Epoch 120):	2.6267723995943015E-8
Global Best Evaluation (Epoch 126):	7.836298721031199E-9
Global Best Evaluation (Epoch 130):	6.1849121379964345E-9
Global Best Evaluation (Epoch 132):	5.719776652313158E-9
Global Best Evaluation (Epoch 142):	3.863750208665806E-9
Global Best Evaluation (Epoch 150):	2.6104345351996017E-9
Global Best Evaluation (Epoch 154):	2.4920687735630054E-9
Global Best Evaluation (Epoch 157):	4.022133737180411E-10
Global Best Evaluation (Epoch 162):	1.1517897746671224E-10
Global Best Evaluation (Epoch 167):	8.520117944499361E-11
Global Best Evaluation (Epoch 179):	6.695799470435304E-11
Global Best Evaluation (Epoch 185):	5.170619488126249E-11
Global Best Evaluation (Epoch 186):	2.0325074956417666E-11
Global Best Evaluation (Epoch 189):	1.5980106127244653E-11
Global Best Evaluation (Epoch 195):	3.3644198538240744E-12
Global Best Evaluation (Epoch 206):	1.3749001936957939E-12
Global Best Evaluation (Epoch 207):	2.2026824808563106E-13
Global Best Evaluation (Epoch 224):	1.9895196601282805E-13
Global Best Evaluation (Epoch 226):	1.6342482922482304E-13
Global Best Evaluation (Epoch 229):	9.947598300641403E-14
Global Best Evaluation (Epoch 236):	9.237055564881302E-14
Global Best Evaluation (Epoch 238):	7.460698725481052E-14
Global Best Evaluation (Epoch 240):	1.4210854715202004E-14
Global Best Evaluation (Epoch 242):	7.105427357601002E-15
Global Best Evaluation (Epoch 245):	3.552713678800501E-15
Global Best Evaluation (Epoch 257):	0.0
---------------------------RESULT---------------------------
x = -2.1652314152008058E-16
y = 2.8876173252079404E-16
Final Best Evaluation: 0.0
---------------------------COMPLETE-------------------------
```

## Usage
Navigate directly above the PSO folder.

To run it with the default parameters:
```
java PSO.Main
```
To run it with custom parameters:
```
java PSO.Main -p
```
