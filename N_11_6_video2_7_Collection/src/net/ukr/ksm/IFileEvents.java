package net.ukr.ksm;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
