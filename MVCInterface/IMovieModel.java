/**
 * 
 */
package MVCInterface;
import java.util.List;

/**
 * Model interface, completely independent from the view (GUI)
 * component. The controller acts as an interface between them.
 * 
 * @author nivil
 *
 */
public interface IMovieModel {
	
	/**
	 * Register new user
	 * @param name User name
	 * @param usrId User ID (unique key)
	 * @return True if registered correctly
	 */
	boolean register(String name, int usrId);
	/**
	 * Log in the user to the application
	 * @param name User name
	 * @param usrId User ID (unique key)
	 * @return True if logged in correctly
	 */
	boolean logIn(String name, int usrId);
	/**
	 * Check if the movie is available for renting.
	 * @param movieId Movie ID (unique key)
	 * @return True if available
	 */
	boolean isAvailable(int movieId);
	/**
	 * Rent the given movie for the given user
	 * @param usrId User ID (unique key)
	 * @param movieId Movie ID (unique key)
	 * @return True if rented to the user
	 */
	boolean rentMovie(int usrId, int movieId);
	/**
	 * Add review about the movie
	 * @param usrId User ID (unique key)
	 * @param movieId Movie ID (unique key)
	 * @param grade Movie grade by the user (1-5)
	 * @param review User review
	 * @return True if review added correctly
	 */
	boolean addReview(int usrId, int movieId, int grade, String review);
	/**
	 * Look up for movie in the system according to given conditions.
	 * Not all arguments are necessary. If NaN value is given - ignores the argument.
	 * @param name Movie name. NaN value - null
	 * @param lowerGrade Lower bound of movie grade. NaN value - -1
	 * @param upperGrade Upper bound of movie grade. NaN value - -1
	 * @param keyWords Key words in movie name or movie description. NaN value - null
	 * @param category Movie category. NaN value - null
	 * @param isAvailable Only movie available for renting. Default False.
	 * @return
	 */
	List<String> lookUp(String name, int lowerGrade, int upperGrade, String keyWords, String category, boolean isAvailable); 

	

}
