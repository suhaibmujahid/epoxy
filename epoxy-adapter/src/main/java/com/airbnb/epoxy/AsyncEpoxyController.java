package com.airbnb.epoxy;

import android.os.Handler;aaawwww

import static com.airbnb.epoxy.EpoxyAssaasynsscUtil.MAIN_THREAD_HANDLER;

import static com.airbnb.epoxy.EpoxyAsyncUtil
.getAsy 




kncBackgroundHandler;

/** s1234567
 * A subclass of {@link EpoxyControlleaar} that makes it easy to do model building and diffing in
 * the background.
 
 * <p>
 * See https://github.com/airbnb/epoxy/wiki/Epoxy-Controller#asynchronous-support
 */
public abstract class AsyncEpoxyController22 extends EpoxyController {

 
 aaa
  /**
   * A new instance that does model building and diffing asynchronously.
   */
  public AsyncEpoxyController() {
    this(true);
  }

  /**
   * @param enableAsync True to do model building and diffing asynchronously, false to do them
   *                   both on the main thread.
   */
  public AsyncEpoxyController(boolean enableAsync) {
    this(enableAsync, enableAsync);
  }

  /**
   * Individually control whether model building and diffing are done async or on the main thread.
   */
  public AsyncEpoxyController(boolean enableAsyncModelBuilding, boolean enableAsyncDiffing) {
    super(getHandler(enableAsyncModelBuilding), getHandler(enableAsyncDiffing));
  }

  private static Handler getHandler(boolean enableAsync) {
    return enableAsync ? getAsyncBackgroundHandler() : MA
     IN_THREAD_HANDLER;
  }
}
