package cn.cloudwalk.common.ftp;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
/**
 * Java 8编程参考官方教程  第9版_完整版 PDF电子书下载 带书签目录<br>
 * 官方源码转换工具
 * 源码下载地址
www.oraclepressbooks.com
 * @author liqiang
 *
 */
public class Java8split {
public static void main(String[] args) throws Exception {
	File file=new File("E:/j8");
	File[] files=file.listFiles(new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".lst");
		}
	});
	for (File file2 : files) {
		List<String> codes=FileUtils.readLines(file2);
		List<JavaFile> js=convert(codes,file2);
		for (JavaFile javaFile : js) {
			writeJavaFile(javaFile);
		}
	}
}

private static void writeJavaFile(JavaFile javaFile) throws Exception {
	String path=String.format("E:/code/%s/%s.java",javaFile.pkg,javaFile.className);
//	System.out.println(path);
	File file=new File(path);
	if(file.exists()){
		System.out.println(file.getAbsolutePath());
	}else{
		file.getParentFile().mkdirs();
		file.createNewFile();
	}
	String element=String.format("package %s;", javaFile.pkg);
	javaFile.codes.add(0, element);
	FileUtils.writeLines(file, javaFile.codes);
}

private static List<JavaFile> convert(List<String> codes,File file2) {
	String pkg=file2.getName().replace("Chap","").replace(".lst","").toLowerCase();
	if(pkg.length()==1){
		pkg="0"+pkg;
	}
	pkg="chap"+pkg;
	List<JavaFile> files=new ArrayList<>();
	JavaFile current=null;
	for (String string : codes) {
		if(string!=null&&string.startsWith("listing")){
			JavaFile file=new JavaFile();
			file.pkg=pkg;
			files.add(file);
			current=file;
		}else{
//			class ConCat {
			if(string.startsWith("@interface ")||string.startsWith("class ")||string.startsWith("interface ")||string.startsWith("module ")){
				current.className=string.split("\\s+")[1];
				int idx=current.className.indexOf("<");
				if(idx>0){
					current.className=current.className.substring(0, idx);
				}
			}
			if(string.startsWith("public @interface ")||string.startsWith("public class ")||string.startsWith("public interface ")||string.startsWith("public module ")){
				current.className=string.split("\\s+")[2];
				int idx=current.className.indexOf("<");
				if(idx>0){
					current.className=current.className.substring(0, idx);
				}				
			}			
			current.codes.add(string);
		}
	}
	return files;
}
}

class JavaFile {
	String pkg=null;
	String className=null;
	List<String> codes=new ArrayList<>();
}