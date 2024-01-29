package DB;

public class SQL {
	
	
	//Lectures
	public static final String INSERT_LEC="";
	public static final String SELECT_LEC="";
	public static final String SELECT_LECS="";
	public static final String UPDATE_LEC="";
	public static final String DELETE_LEC="";
	
	//Students
	public static final String INSERT_STD=
			"insert into `students` values(?,?,?,?,?,?,?,?,?); ";
	public static final String SELECT_STD="select * from `students` where `stdno`=? and `stdpass`=?";
	public static final String SELECT_STDS="";
	public static final String UPDATE_STD="";
	public static final String DELETE_STD="";
	
	//Departments
	public static final String INSERT_DEP="";
	public static final String SELECT_DEP="";
	public static final String SELECT_DEPS="";
	public static final String UPDATE_DEP="";
	public static final String DELETE_DEP="";
	
	
	//Register
	public static final String INSERT_REG="";
	public static final String SELECT_REG="";
	public static final String SELECT_REGS="";
	public static final String UPDATE_REG="";
	public static final String DELETE_REG="";
	
	
	//Professors
	public static final String INSERT_PRO="";
	public static final String SELECT_PRO="";
	public static final String SELECT_PROS="";
	public static final String UPDATE_PRO="";
	public static final String DELETE_PRO="";
	
}
