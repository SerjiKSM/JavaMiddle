package net.ukr.ksm;

public interface IFileEvents {
	void onFileChanged(String path);

	void onFileAdded(String path);
}
