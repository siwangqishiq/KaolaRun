package de.swagner.paxbritannica.particlesystem;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Pool.Poolable;

/**
 * 
 * @author panyi 
 *
 */
public class Particle implements Poolable {

    float life;
    Vector2 position = new Vector2();
    Vector2 velocity = new Vector2();
    float scale;
	
    public Particle() {
	}

	public void setup(Vector2 position, Vector2 velocity, float life, float scale) {
		this.position.set(position);
		this.velocity.set(velocity);
		this.life = life;
		this.scale=scale;
	}

    @Override
    public void reset()
    {
        
    }
}
