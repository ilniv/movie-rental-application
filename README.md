# movie-rental-application

פונקציונאיליות:
1.	כניסה/ יציאה של משתמש
2.	קבלת פרטים על המשתמש:
א.	פרטים אישיים
ב.	היסטוריית השכרות
ג.	מושכרים כעט
3.	קטלוג סרטים:
א.	חלוקה לקטגוריות
ב.	השכרה ע"פ זמינות
ג.	מידע על כל סרט: תקציות ציון, מחיר להשכרה, אורך, קטגוריה וכו'
4.	חיפוש:
א.	לפי קטגוריה
ב.	לפי מילות מפתח
ג.	לפי פילטרים: אורך, ציון, זמינות להשכרה וכו'
טכנולוגיות:
1.	JavaFX
2.	JDBC
3.	JSF

אובייקטים ושדות:


Movie:
1.	String name
2.	Long id
3.	int grade
4.	String description
5.	String category
6.	int countOfMovies
7.	Map <Long, String> usersReview


User:
1.	String name
2.	Long id
3.	Map<Long, Boolean> userHistory


טבלאות:

Users
Long index	Long id	Long name
1 (incremental)	300780030	Israel Israeli

UserHistory
Long userId	Long movieId	Boolean isExist
300780030	1	Yes
300780030	2	No


Movies
Long id	String name	String category	Int grade	String description	int countOfMovies
1 (incremental)	Cars	family	4.5	The story of…	3
2	Cars 2	family	4.8	The story of…	1

UsersReview
Long movieId	Long userId	Varchar review
1	300780030	Great Movie!!

*הנחות עבור המבנה לעיל:
1.	- מכל סרט קיים מספר כלשהו של סרטים במלאי. מספר זה נמצא בטבלת הסרטים.
2.	- אפשר להזין קטגוריה אחת לכל סרט
3.	- היסטוריית הזמנות עבור כל לקוח תכיל כל סרט רק פעם אחת. אם לקח סרט שוב, הוא יימצא ברשימה אך ורק פעם אחת
4.	- לקוח יכול לרשום חוות דעת אחת בלבד עבור כל סרט. המפתח במפה יהיה של המזהה של הלקוח.
