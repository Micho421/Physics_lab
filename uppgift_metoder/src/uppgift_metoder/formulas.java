package uppgift_metoder;

public class formulas {

	
		
		
		public static double fahrenheitToCelsius(double fahrenheit)/*1an*/ {
			double celsius = ((fahrenheit-32)*5)/9;
			return celsius;
		}
		public static double kelvinToCelsius(double kelvin)/*2an*/ {
			double celsius = kelvin - 273.15;
			return celsius;
		}
		public static double fluidPressure(double fluid,double deep)/* 3an*/ {
			double g=9.82;
			double vätsketryck = g*fluid*deep;
			return vätsketryck;
		}
		public static double pressureUnderWater(double deep) /*4an*/{
			double pressure = 9.82*997/*vatten densitet*/*deep;
			return pressure;
		}
		public static double kineticEnergy(double mass, double velocity)/*5an*/ {
			double KineticEnergy = mass*Math.pow(velocity, 2)*0.5;
			return KineticEnergy;
		}
		public static double potentialEnergy(double mass, double height) /*6an*/{
			double PotentialEnergi= mass*height*9.82;
			return PotentialEnergi;
		}
		public static double fallSpeed(double height)/*7an*/{
			double fallsped = 
		}
		public static double delta(double first, double last) /*8*/{
			double delta= first-last;
			return delta;
			
		}
		public static double volumeToMass(FluidTable fluid, double volume)/*9*/ {
			double VolymToMass= fluid.density*volume;
			return VolymToMass;
		}
		public static double volumeToMass(GasTable gas, double volume) /*10*/{
			double VolymToMass= gas.density*volume;
			return VolymToMass;
			
		}
		public static double volumeToMass(SolidTable solid, double volume) /*11*/{
			double heat=solid.density*volume;
			return heat;
		}
		public static double svtVelocity(double distance, double time)/*12*/ {
			double svtVelocity= distance/time;
			return svtVelocity;
		}
		public static double svtDistance(double velocity, double time)/*13*/{
			double svtDistance=velocity*time;
			return svtDistance;
		}
		public static double svtTime(double distance, double velocity)/*14*/{
			double svtTime=distance/velocity;
			return svtTime;	
		}
		public static double work(double force, double distance)/*15*/{
			double work=force*distance;
			return work;
		}
		public static double power(double work, double time)/*16*/{
			double power=work/time;
			return work;
		}
		public static double heat(SolidTable solid, double mass, double deltaT)/*17*/{
			double heat=solid.heatCapacity*mass*deltaT;
			return heat;
		}
		public static double heat(FluidTable fluid, double volume, double deltaT)/*18*/{
			double heat=fluid.heatCapacity*volume*deltaT;
			return heat;
		}
		public static double heat(GasTable gas, double volume, double deltaT)/*19*/{
			double heat=gas.heatCapacity*volume*deltaT;
			return heat;
		}
		public static double velocityToHeight(double velocity)/*20*/{
			double velocityToHeight= ;
			return velocityToHeight;
		}
	


























}
