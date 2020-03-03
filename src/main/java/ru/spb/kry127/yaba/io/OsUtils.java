package ru.spb.kry127.yaba.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public interface OsUtils {
  /**
   * Перенаправляет поток ввода в поток вывода.
   *
   * @param in  поток ввода
   * @param out поток вывода
   */
  void redirectIOStreams(@NotNull InputStream in, @NotNull OutputStream out);

  @NotNull
  @Deprecated
  public Runnable ioStreamsRedirector(@NotNull InputStream in, @NotNull OutputStream out, String name);

  void redirectIOStdStreams(@NotNull OutputStream outStream1,
                            @NotNull OutputStream outStream2,
                            @NotNull OutputStream outStream3,
                            @NotNull InputStream inStream1,
                            @NotNull InputStream inStream2,
                            @NotNull InputStream inStream3);

  /**
   * Проверяет наличие программы в переменной окружения и
   * возвращает путь, если он существует.
   *
   * @param name программа, которую необходимо найти
   * @return Путь к программе, если он есть, иначе возвращается <tt>null</tt>
   */
  @Nullable
  Path checkProgramExists(@NotNull String name) throws IOException;
}
