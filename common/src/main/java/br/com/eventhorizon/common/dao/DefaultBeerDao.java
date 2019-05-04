package br.com.eventhorizon.common.dao;

import br.com.eventhorizon.common.model.Beer;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

@Service
public final class DefaultBeerDao implements BeerDao {

  private static final String[] beerStyles = { "IPA", "APA", "Stout", "Pilsner", "Tripel", "Dubel", "Blond", "Weiss", "Dunkel" };

  private final static Random RANDOM = new SecureRandom();

  private final Map<String, Beer> beerMap = Collections.synchronizedSortedMap(new TreeMap<>());

  public DefaultBeerDao() {
    for (int i = 0; i < 10; i++) {
      create(generateRandomBeer());
    }
  }

  @Override
  public Beer get(String id) {
    return beerMap.get(id);
  }

  @Override
  public Collection<Beer> get(long limit) {
    return Collections.unmodifiableCollection(beerMap.values());
  }

  @Override
  public Beer create(Beer obj) {
    if (obj.getId() == null || obj.getId().trim().isEmpty()) {
      obj.setId(UUID.randomUUID().toString());
    }
    beerMap.put(obj.getId(), obj);
    return obj;
  }

  @Override
  public Beer update(String id, Beer obj) {
    return create(obj);
  }

  @Override
  public boolean delete(String id) {
    return beerMap.remove(id) != null;
  }

  private static Beer generateRandomBeer() {
    String id = UUID.randomUUID().toString();
    String name = "Beer-"  + String.format("%04d", RANDOM.nextInt(9999));
    String style = beerStyles[RANDOM.nextInt(beerStyles.length)];

    return new Beer(id, name, style);
  }

}
