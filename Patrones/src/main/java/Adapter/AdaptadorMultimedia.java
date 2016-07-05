/**
 * 
 */
package Adapter;

/**
 * @author JuanClavero
 *
 */
public class AdaptadorMultimedia implements ReproductorMultimedia {

	private CodecMultimedia codec;

	/**
	 * @return the codec
	 *
	 */
	public void reproducir() {

	};

	/**
	 * @param codec
	 */
	public AdaptadorMultimedia(CodecMultimedia codec) {
		super();
		this.codec = codec;
	}

	/**
	 * 
	 */
	public AdaptadorMultimedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodecMultimedia getCodec() {
		return codec;
	}

	/**
	 * @param codec
	 *            the codec to set
	 */
	public void setCodec(CodecMultimedia codec) {
		this.codec = codec;
	}
}
