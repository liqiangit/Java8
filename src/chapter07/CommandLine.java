package chapter07;

/**
 * p156 使用命令行参数
 * eclipse 执行 run as -> Run configurations -> Arguments 
 * @author marsamoeba
 *
 */
// Display all command line arguments.
public class CommandLine {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "]: " + args[i]);
	}
}
