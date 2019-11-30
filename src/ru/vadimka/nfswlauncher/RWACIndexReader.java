package ru.vadimka.nfswlauncher;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * Класс-декодер индекса Racing World AntiCheat
 * Это лишь демонстрационный файл, который описывает методы
 * тело методов скрыто
 * @author Vadimka
 *
 */
public class RWACIndexReader {
	
	public RWACIndexReader(File file) {}
	
	public RWACIndexReader(InputStream inputStream) {}
	
	public RWACIndexReader(String filePath) {
		this(new File(filePath));
	}
	/**
	 * Добавить файл
	 * @param path - Путь к файлу
	 * @param checksum - Контрольная сумма файла
	 */
	public void setFile(String name, String path, String download, String[] checksum) {}
	/**
	 * Получить список файлов
	 * @return
	 */
	public List<RWACFile> getFiles() {return null;}
	/**
	 * Проверка файла на заголовок
	 */
	public boolean check() {return false;}
	/**
	 * Прочитать данные из файла
	 * @throws RWEncoderException 
	 */
	public void read() throws RWEncoderException {}
	
	public static class RWACFile {
		public RWACFile(String name, String path, String download, String[] checksum) {}
		/**
		 * Получить имя файла
		 */
		public String getName() {return null;}
		/**
		 * Получить список контрольных сумм
		 */
		public String[] getChecksum() {return null;}
		/**
		 * Получить ссылку на загрузку файла
		 */
		public String getDownload() {return null;}
		/**
		 * Получить католог, в котором находится файл
		 */
		public String getPath() {return null;}
	}
}
