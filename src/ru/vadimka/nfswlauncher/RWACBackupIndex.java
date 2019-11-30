package ru.vadimka.nfswlauncher;
import java.util.HashMap;

public class RWACBackupIndex {
	
	public RWACBackupIndex(String filePath) {}
	/**
	 * Установить последний сервер
	 * @param servername - Имя сервера
	 */
	public void setLastServer(String servername) {}
	/**
	 * Получить последний сервер
	 */
	public String getLastServer() {return null;}
	/**
	 * Добавить файл
	 * @param path - Путь к файлу
	 * @param checksum - Контрольная сумма файла
	 */
	public void setFile(String path, String checksum) {}
	/**
	 * Получить список файлов
	 * @return
	 */
	public HashMap<String,String> getFiles() {return null;}
	/**
	 * Существует ли файл
	 * @return
	 */
	public boolean exists() {return false;}
	/**
	 * Проверка файла на заголовок
	 */
	public boolean check() {return false;}
	/**
	 * Записать данные в файл
	 */
	public void write() {}
	/**
	 * Прочитать данные из файла
	 */
	public void read() {}
}
