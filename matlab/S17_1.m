t=0:0.01:3;						%ʱ����Ϊ0.01˵������Ƶ��Ϊ100 Hz
x=sin(2*pi*30*t)+sin(2*pi*500*t);	%������ҪƵ��Ϊ30Hz��500Hz���ź�
 f=x+3.4*randn(1,length(t));			%���ź��м��������
% f=x;
subplot(121);
plot(f);							%����ԭʼ�źŵĲ���ͼ
ylabel('��ֵ');
xlabel('ʱ��');
title('ԭʼ�ź�');
y=fft(f,1024);	%��ԭʼ�źŽ�����ɢ����Ҷ�任���μ�DFT�Ĳ��������Ϊ1024
p=y.*conj(y)/1024;					%���㹦�����ܶ�
ff=100*(0:511)/1024;				%����任��ͬ������Ӧ��Ƶ��ֵ
subplot(122);
plot(ff,p(1:512));					%�����źŵ�Ƶ��ͼ
ylabel('�������ܶ�');
xlabel('Ƶ��');
title('�źŹ�����ͼ');