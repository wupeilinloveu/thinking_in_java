package java06_access_permission_control_test;

/**
 * Created by Emily on 2021/9/8
 */
public class Test08_ConnectionManager {
    int countOfConnection = 4;

    Connection[] ca = new Connection[countOfConnection];

    // 非静态实例初始化
    {
        for (int i = 0; i < countOfConnection; ++i) {
            ca[i] = Connection.makeConnection();
        }
    }

    public Connection getConnection(int i) {
        if (i < countOfConnection) {
            return ca[i];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Test08_ConnectionManager c = new Test08_ConnectionManager();
        for (int i = 0; i < c.countOfConnection + 1; ++i) {
            Connection connection = c.getConnection(i);
            if (connection != null) {
                System.out.println("num = " + connection.getCount());
            } else {
                System.out.println("null");
            }
        }

    }
}

class Connection {
    private static int count = 0; // 统计创建数

    private Connection() {
        count++;
    }

    public static Connection makeConnection() {
        return new Connection();
    }

    public int getCount() {
        return count--;
    }
}

