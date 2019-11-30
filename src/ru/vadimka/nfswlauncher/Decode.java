package ru.vadimka.nfswlauncher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Деродер
 * Это лишь демонстрационный файл, который описывает методы
 * тело методов скрыто
 * @author Vadimka
 */
public class Decode {
	/**
	 * раскодировать содержимое файла
	 * @param inFile - Исходный файл
	 * @param outFile - Выходной файл
	 */
	public static void decodeFile(File inFile, File outFile) throws Exception {
		decodeFile(inFile, new FileOutputStream(outFile));
	}
	/**
	 * раскодировать содержимое файла
	 * @param inFile - Исходный файл
	 * @param outStream - Выходной стрим
	 */
	public static void decodeFile(File inFile, OutputStream outStream) throws Exception {}
}
