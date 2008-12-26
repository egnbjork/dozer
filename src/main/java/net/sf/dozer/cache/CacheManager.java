/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.dozer.cache;

import java.util.Collection;

/**
 * Internal interface for managing caches. Only intended for internal use.
 * 
 * @author tierney.matt
 * @author dmitry.buzdin
 */
public interface CacheManager {

  /**
   * Clears all available caches. Should not be used in production. Can be applied on "soft" application restart.
   */
  public void clearAllEntries();

  /**
   * Returns a Set of all Cache names
   * @return Set of String objects representing Cache names.
   */
  public Collection getCacheNames();

  public Collection getCaches();

  /**
   * Get Cache object by name.
   * @param cacheName unique cache name
   * @return Cache object or will throw MappingException in case Cache is not registered.
   */
  public Cache getCache(String cacheName);

  public void addCache(String cacheName, long maximumSize);

  public boolean cacheExists(String cacheName);

}