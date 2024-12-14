package ki302.Bibun.Lab2;

import static java.lang.System.out;
import java.io.*;


public class Human {

	private PrintWriter fout;
	private Step leftLeg;
	private Step rightLeg;
	
	/**
	 * Constructor
	 * @throws FileNotFoundException
	 */
	
public Human() throws FileNotFoundException
{
	fout = new PrintWriter(new File("E:\\Repos\\CPPT_LABS\\LAB_2\\ki302\\Bibun\\Lab2\\Log.txt"));
	leftLeg = new Step();
	rightLeg = new Step();
}

	/**
	 * Method does step with left leg
	 */
public void LeftLegStep()
{	
	fout.print("Крок лівою ногою #"  + leftLeg.countStep(leftLeg) + "\n");
	fout.flush();
}

	/**
	 * Method does step with right leg
	 */
public void RightLegStep()
{	
	fout.print("Крок правою ногою #" + rightLeg.countStep(rightLeg) + "\n");
	fout.flush();
}

	


	/** 
	 * Method returns all right steps
	 * @return count right steps
	 */
public int countRightSteps()
{
	return rightLeg.countStep(rightLeg) - 1;
}

	/** 
	 * Method returns all left steps
	 * @return count left steps
	 */
public int countLeftSteps()
{
	return leftLeg.countStep(leftLeg) - 1;
}

		/**
		 * Method ruturns all steps by one Human object 
		 * @return all steps by one Human object 
		 */
public int getAllSteps()
{
	fout.print("Всього кроків: " + (countLeftSteps() + countRightSteps()) + "\n");
	fout.flush();
	return (countLeftSteps() + countRightSteps() - 2);
}
/**
 * Method return all gone distance
 */
public float getDoneDistance()
{
	float distance = (countLeftSteps() - 2) * leftLeg.getLenghStep() + (countRightSteps() - 2) * rightLeg.getLenghStep();
	fout.print("Пройдена відстань: " + distance + "\n");
	fout.flush();
	return distance;
}





/**
* @author Taras
* Class <code>Leg</code> implements Human Leg
*/
class Step{
	
	private float lenghStep;
	private int stepCount;
	/**
	* Constructor
	*/
	public Step()
	{
		lenghStep = (float)0.6;
		stepCount = 0;
	}
	/**
	 * Constructor
	 * @param LenghtStep
	 */
	public Step(float newLenghtStep)
	{
		lenghStep = newLenghtStep;
		stepCount = 0;
	}
	
	
	/**
	 * Method returns lengh of Step
	 * @return lengh of Step
	 */
	public float getLenghStep()
	{
		return lenghStep;
	}
	
	/** Metgod sets lengh of Step;
	 *
	 */
	public void setLenghStep(Step leg, float newLenghStep)
	{
		lenghStep = newLenghStep;
	}
	
	/**
	* Method counts one Leg step
	* @return count one and only one leg steps 
	*/
	public int countStep(Step leg)
	{
		stepCount++;
		return stepCount;
	}

}



}



