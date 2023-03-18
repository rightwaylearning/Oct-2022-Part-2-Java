package file_store;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.functionality.DBConnection;

public class FileStore {

	void storeFileDeatils(Integer id, String fileName, String path) {

		try {
			FileInputStream input = new FileInputStream(new File(path));

			Connection con = DBConnection.getConnection();
			PreparedStatement stm = con.prepareStatement("insert into records_info values(?,?,?)");
			stm.setInt(1, id);
			stm.setString(2, fileName);
			stm.setBlob(3, input);
			int i = stm.executeUpdate();
			System.out.println(i);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void readFile(Integer id) {
		String filePath = "D:\\java_program\\picture.mp4";
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement stm = con
					.prepareStatement("select file_id,file_name,actual_file from records_info where file_id = ?");
			stm.setInt(1, id);
			ResultSet set = stm.executeQuery();
			if (set.next()) {
				Integer i = set.getInt(1);
				String name = set.getString(2);

				Blob blob = set.getBlob(3);
				InputStream stream = blob.getBinaryStream();

				FileOutputStream out = new FileOutputStream(filePath);

				int data = stream.read();

				while (data != -1) {
					out.write(data);
					data = stream.read();
				}

				stream.close();
				out.close();
				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
